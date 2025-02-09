plugins {
    java
    id("org.springframework.boot") version "3.4.2"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral() // https://mvnrepository
    google()
    maven { url = uri("https://jitpack.io") } // [1]
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation("com.github.merge-simpson:mentoring-cors-core-2025:0.1.0-rc2") // [2]
}

tasks.withType<Test> {
    useJUnitPlatform()
}
