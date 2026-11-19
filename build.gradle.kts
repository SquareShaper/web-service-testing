plugins {
    id("java")
}

group = "com.squareshaper"
version = "0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("io.javalin:javalin:7.2.4")
}

tasks.test {
    useJUnitPlatform()
}