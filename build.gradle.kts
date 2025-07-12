plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    implementation("com.codeborne:selenide:7.7.1")
}

tasks.test {
    useJUnitPlatform()
}