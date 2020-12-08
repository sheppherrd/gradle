plugins {
    id("gradlebuild.build-logic.kotlin-dsl-gradle-plugin")
}

dependencies {
    implementation(project(":idea"))
    implementation(project(":profiling"))

    implementation("com.diffplug.spotless:spotless-plugin-gradle") {
        exclude(group = "org.codehaus.groovy", module = "groovy-xml")
        because("The plugin implementation requires it to be on the root project classpath")
    }
}
