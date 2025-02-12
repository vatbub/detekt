plugins {
    id("module")
}

dependencies {
    api(projects.detektApi)
    testImplementation(projects.detektTestUtils)
    testImplementation(testFixtures(projects.detektApi))
    testImplementation(libs.bundles.mocking)
    testImplementation(libs.assertj)
}
