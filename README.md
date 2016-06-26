##Eureka Server - Spring Security based login (using LDAP-ldif)

This application will act as a registry service micro-services based applications.

It use the config server (URI `http://localhost:8888`) to get the configurations in the startup and configure the LDAP using the ldif (file `classpath:myLdap.ldif`).