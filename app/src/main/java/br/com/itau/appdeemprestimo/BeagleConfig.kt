package br.com.itau.appdeemprestimo

import br.com.zup.beagle.annotation.BeagleComponent
import br.com.zup.beagle.setup.BeagleConfig
import br.com.zup.beagle.setup.Environment

@BeagleComponent
class AppBeagleConfig: BeagleConfig {
    override val environment: Environment get() = Environment.DEBUG // return the current build state of your app
    override val baseUrl: String get() = "http://10.0.2.2:8080" // return the base url based on your environment
}