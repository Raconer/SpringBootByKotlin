import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.5"
	id("io.spring.dependency-management") version "1.1.3"
	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	kotlin("kapt") version "1.9.23"
	// JPA 생성자 초기화 제거 용도
	kotlin("plugin.jpa") version "1.9.24"
	// JSON
	kotlin("plugin.serialization") version "1.9.23"
}

group = "com.by"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	// Spring Boot
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	// JPA
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	// jpa query logging
	implementation("com.github.gavlyukovskiy:p6spy-spring-boot-starter:1.9.1")

	// QueryDSL
	implementation("com.querydsl:querydsl-jpa:5.0.0:jakarta")
	kapt("com.querydsl:querydsl-apt:5.0.0:jakarta")

	// DB
	runtimeOnly("com.h2database:h2")

	// MQ
	implementation("org.springframework.kafka:spring-kafka")

	// Health Check
	implementation("org.springframework.boot:spring-boot-starter-actuator")

	// Monitoring
	implementation("io.micrometer:micrometer-registry-prometheus")

	// Tester
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
