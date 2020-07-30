# Logger for Java

<p align="center">
    <img src="https://img.shields.io/github/license/SantaSpeen/Logger.Java?style=for-the-badge">
    <img src="https://img.shields.io/github/issues/SantaSpeen/Logger.Java?style=for-the-badge">
</p>

### Installing

* Download this repo
* Init in your project

### Usage
Java:
```java
import Logger;

public class main{
    private static final Logger LOG = new Logger("Module name");
    
    public main(String[] args) {
    	LOG.core("Logger: Core");
        LOG.info("Logger: Info");
        LOG.warn("Logger: Warn");
        LOG.error("Logger: Error");
    }

}
```
Kotlin: 
```kotlin
import Logger

class main{
    var LOG = Logger("Module name")
    
    @JvmStatic
    fun main(args: Array<String>) {
        LOG.core("Logger: Core")
        LOG.info("Logger: Info")
        LOG.warn("Logger: Warn")
        LOG.error("Logger: Error")
    }
}

```

### Links!

- [Link to this project](https://github.com/SantaSpeen/Logger.Java)

- [Author](https://vk.com/id370926160)
