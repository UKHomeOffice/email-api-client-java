# Email API Client

[![Build Status](https://travis-ci.org/UKHomeOffice/email-api-client-java.svg?branch=master)](https://travis-ci.org/UKHomeOffice/email-api-client-java)

This is a client for the [Email API](https://github.com/UKHomeOffice/email-api)

## Getting Started

This documents how to get started using Maven or Gradle.

### Adding to your project

#### Gradle

Add JetPack as a repository

```gradle
 repositories {
        // ...
        maven { url "https://jitpack.io" }
    }
```



```gradle
    dependencies {
            compile 'com.github.UKHomeOffice:email-api-client:v0.1.2'
    }
```

#### Maven

```xml
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
```

```xml
    <dependency>
        <groupId>com.github.UKHomeOffice</groupId>
        <artifactId>email-api-client</artifactId>
        <version>v0.1.2</version>
    </dependency>
```

### Using it

```java
import uk.gov.homeoffice.emailapi.client;
```

```java
ApiClient client = new ApiClient("localhost");
OutboundApi outboundEmailApi = new OutboundApi(client);

TemplatedEmail email = TemplatedEmail();

// Set some parameters on the email
// email.setSender("annie@example.com");
// etc.

outboundEmailApi.sendEmail(email);
```

## Built With

* swagger-codegen

## Find Us

* [GitHub](https://github.com/UKHomeOffice/email-api-client-java)

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the 
[tags on this repository](https://github.com/UKHomeOffice/email-api/tags). 

## Authors

See also the list of [contributors](https://github.com/UKHomeOffice/email-api/contributors) who 
participated in this project.

## License

This project is licensed under the GPL v2 License - see the [LICENSE.md](LICENSE.md) file for details.
