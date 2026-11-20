plugins {
    id("java")
    id("com.gradleup.shadow") version "9.6.1"
}

group = "com.squareshaper"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("io.javalin:javalin:7.2.4")
    implementation("org.slf4j:slf4j-simple:2.0.20")
    implementation("org.webjars.npm:vue:3.5.45")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.22.4")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "Server"
    }
}

