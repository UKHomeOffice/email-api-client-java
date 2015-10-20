# Email API Client

[![GitHub version](https://badge.fury.io/gh/ukhomeoffice%2Femail-api-client-java.svg)](https://badge.fury.io/gh/ukhomeoffice%2Femail-api-client-java) [![Build Status](https://travis-ci.org/UKHomeOffice/email-api-client-java.svg?branch=master)](https://travis-ci.org/UKHomeOffice/email-api-client-java)

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
            compile 'com.github.UKHomeOffice:email-api-client:v0.1.3'
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
        <version>v0.1.3</version>
    </dependency>
```

### Using it

```java
import io.swagger.client.ApiClient;
import io.swagger.client.model.TemplatedEmail;
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
[tags on this repository](https://github.com/UKHomeOffice/email-api-client-java/tags). 

## Authors

See the list of [contributors](https://github.com/UKHomeOffice/email-api-client-java/contributors) who 
participated in this project.

## License

This project is licensed under the GPL v2 License - see the [LICENSE.md](LICENSE.md) file for details.
