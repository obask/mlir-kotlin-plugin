package my.kotlin.fir2mlir

import org.jetbrains.kotlin.fir.extensions.FirExtensionRegistrar

class FirPluginPrototypeExtensionRegistrar : FirExtensionRegistrar() {
  override fun ExtensionRegistrarContext.configurePlugin() {
    +::PluginAdditionalCheckers
  }
}
