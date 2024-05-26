package br.com.erudio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ErudioApplication

fun main(args: Array<String>) {
    runApplication<ErudioApplication>(*args)
}
