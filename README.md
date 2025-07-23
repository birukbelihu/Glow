# Glow 🌈

**Glow** is a lightweight, **markdown-style console text formatter** for Java. It enables developers to output styled text in the terminal using simple and readable tags like `[red bold]Error[/]`.

---

### ⭐ Features

- ✅ **Markdown-style tags**: `[red]`, `[green bold]`, `[italic underline]`
- 🎨 **Foreground & background colors**
- 🪄 **Text styles**: `bold`, `dim`, `italic`, `underline`
- 🔄 **Nested tag support**

---

## 🚀 Getting Started

### Maven Setup (with JitPack)

1. Add JitPack repository:
   ```xml
   <repositories>
     <repository>
       <id>jitpack.io</id>
       <url>https://jitpack.io</url>
     </repository>
   </repositories>
   ```

2. Add Glow dependency:
   ```xml
   <dependency>
     <groupId>com.github.birukbelihu</groupId>
     <artifactId>glow</artifactId>
     <version>1.2.0</version>
   </dependency>
   ```
---

## 🧩 Usage Example

```java
import com.github.biruk.glow.Glow;

public class Main {
    public static void main(String[] args) {
        Glow.println("[green]Success: [bold]42 tests passed![/]");
        Glow.println("[bg-yellow black italic]Warning:[/] Low disk space.");
        Glow.println("[red bold]Error:[/] Something went wrong!");      
    }
}
```

### Tested and works on consoles with 24-bit true color support.

---

## 📦 Library Overview

| Function               | Description                                            |
|------------------------|--------------------------------------------------------|
| `Glow.parse(String)`   | Converts your markdown-style tags to ANSI-coded string |
| `Glow.print(String)`   | Prints without newline                                 |
| `Glow.println(String)` | Prints with newline                                    |
| `Glow.RESET`           | ANSI reset code                                        |

---

## 📄 Demo & Documentation

Check out [Main.java](https://github.com/birukbelihu/Glow/blob/master/src/main/java/Main.java) for:
- ✅ Full usage examples  
- ✅ Tag reference documentation  
- ✅ Quickstart code snippets  

---

## 🙌 Contribute

Want to improve `Glow`? Contributions are welcome!  
- Add nested/background color parsing  
- Support for named themes or gradient output  
- Provide test coverage (JUnit) or CI setup  

---

Shine bright in your terminal! 🚀 
Made with ❤️ by **[BirukBelihu](https://github.com/birukbelihu)**

Support for `[color=#hex]…[/color]` and `[bg=#hex]…[/bg]` tags will be added in upcoming releases 🚀

---

## 📄 License

This project is licensed under the **Apache License 2.0**. See the [LICENSE](LICENSE) file for details.