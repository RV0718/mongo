package com.mongo.morphia.configuration;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.morphia.Datastore;
import xyz.morphia.Morphia;

@Configuration
public class MorphiaDatabaseConfig {

    @Value("${morphia.connection.host}")
    private String mongoHost;

    @Value("${morphia.connection.port}")
    private int mongoPort;

    @Value("${morphia.db-name}")
    private String databasename;

    @Value("${morphia.package-name}")
    private String packagesToScan;

    private MongoClient mongoClient() {
        return new MongoClient(mongoHost, mongoPort);
    }

    private Morphia morphia() {
        return new Morphia();
    }


    @Bean
    public Datastore createDataStore() {
        final Morphia morphia = morphia().mapPackage(packagesToScan);
        final Datastore datastore = morphia.createDatastore(mongoClient(), databasename);
        datastore.ensureIndexes();
        datastore.ensureCaps();
        return datastore;
    }


}
