package io.language.automation.languageautomation

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<LanguageAutomationApplication>().with(TestcontainersConfiguration::class)
        .run(*args)
}
