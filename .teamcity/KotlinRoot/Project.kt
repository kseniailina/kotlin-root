package KotlinRoot

import KotlinRoot.buildTypes.*
import KotlinRoot.vcsRoots.*
import KotlinRoot.vcsRoots.KotlinRoot_HttpsGithubComKseniailinaKotlinRootGitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "9daf54de-c511-44fe-a852-62fdaf1a7cb5"
    id("KotlinRoot")
    parentId("_Root")
    name = "Kotlin Root"

    vcsRoot(KotlinRoot_HttpsGithubComKseniailinaKotlinRootGitRefsHeadsMaster)

    buildType(KotlinRoot_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_6"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${KotlinRoot_HttpsGithubComKseniailinaKotlinRootGitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
