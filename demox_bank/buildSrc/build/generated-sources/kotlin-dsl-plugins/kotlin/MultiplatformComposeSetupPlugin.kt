/**
 * Precompiled [multiplatform-compose-setup.gradle.kts][Multiplatform_compose_setup_gradle] script plugin.
 *
 * @see Multiplatform_compose_setup_gradle
 */
class MultiplatformComposeSetupPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Multiplatform_compose_setup_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
