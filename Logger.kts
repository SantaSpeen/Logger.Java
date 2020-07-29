import java.text.SimpleDateFormat
import java.util.*

class Logger(private val module: String) {
    val time: String
        get() {
            val formatForDateNow = SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SS")
            return formatForDateNow.format(Date())
        }

    fun core(text: String): Logger {
        println("\u001b[34m[$time CORE]: \u001b[35m[$module]\u001b[0m \u001b[34m$text\u001b[0m")
        return this
    }

    fun info(text: String): Logger {
        println("\u001b[32m[$time INFO]\u001b[0m: \u001b[35m[$module]\u001b[0m $text")
        return this
    }

    fun warn(text: String): Logger {
        println("\u001b[33m\u001b[5m[$time WARN]\u001b[0m: \u001b[35m[$module]\u001b[0m $text")
        return this
    }

    fun error(text: String): Logger {
        println("\u001b[31m\u001b[6m[$time ERROR]\u001b[0m:\u001b[35m[$module]\u001b[0m $text")
        return this
    }
}