plugins {
    application
}


group = "${rootProject.group}.interval"


application {
    mainClass.set("$group.Main")
}


dependencies {
    val junitVersion: String by project

    testImplementation("org.junit.jupiter:junit-jupiter:$junitVersion")
}


tasks.test {
    useJUnitPlatform()
}
