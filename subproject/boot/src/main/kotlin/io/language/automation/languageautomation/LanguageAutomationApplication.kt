package io.language.automation.languageautomation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LanguageAutomationApplication

fun main(args: Array<String>) {
    System.setProperty(
        "spring.config.name",
        "application,application-infrastructure",
    )
    runApplication<LanguageAutomationApplication>(*args)
}
