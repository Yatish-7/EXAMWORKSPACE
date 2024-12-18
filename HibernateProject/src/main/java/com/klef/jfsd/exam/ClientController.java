package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientController {

    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                                                     .addAnnotatedClass(Device.class)
                                                     .addAnnotatedClass(Smartphone.class)
                                                     .addAnnotatedClass(Tablet.class)
                                                     .buildSessionFactory();

        // Create session
        Session session = factory.openSession();  // Use openSession() instead of getCurrentSession()

        try {
            // Creating a device
            Device device = new Device();
            device.setBrand("Generic");
            device.setModel("Device-001");
            device.setPrice(299.99);

            // Creating a smartphone
            Smartphone smartphone = new Smartphone();
            smartphone.setBrand("Samsung");
            smartphone.setModel("Galaxy S24");
            smartphone.setPrice(999.99);
            smartphone.setOperatingSystem("Android");
            smartphone.setCameraResolution(108);

            // Creating a tablet
            Tablet tablet = new Tablet();
            tablet.setBrand("Apple");
            tablet.setModel("iPad Pro");
            tablet.setPrice(799.99);
            tablet.setScreenSize(12.9);
            tablet.setBatteryLife(10);

            // Start a transaction
            session.beginTransaction();

            // Save the devices
            session.persist(device);       // Persist the generic device
            session.persist(smartphone);   // Persist the smartphone
            session.persist(tablet);       // Persist the tablet

            // Commit transaction
            session.getTransaction().commit();

            System.out.println("Device, Smartphone, and Tablet saved successfully!");
        } finally {
            session.close(); // Don't forget to close the session
            factory.close(); // Close the factory
        }
    }
}
