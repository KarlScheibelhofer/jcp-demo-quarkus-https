# jcp-quarkus-demo-https

This demo project uses Quarkus and a keystore in PEM (openssl) format.
It uses [java-crypto-tools](https://github.com/KarlScheibelhofer/java-crypto-tools/) for the PEM keystore implementation.

In addition to using a P12 keystore, you ca see this differences:
* Additional dependency in `pom.xml` to `dev.scheibelhofer:crypto-tools`
* A `@QuarkusMain` class to install the `JctProvider`.
* `key-store-file-type` in `application.properties` is `PEM` rather than `PKSC12`.
* `key-store-provider` in `application.properties` is `JctProvider` 