plugins {
    `aegis-java`
    `aegis-publish`
    `aegis-repositories`
}

dependencies {
    compileOnly(libs.lettuce.core)
}

aegisPublish {
    artifactId = "aegis-store"
}