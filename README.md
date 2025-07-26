![GitHub Repo stars](https://img.shields.io/github/stars/BirukBelihu/Glow)
![GitHub forks](https://img.shields.io/github/forks/BirukBelihu/Glow)
![GitHub issues](https://img.shields.io/github/issues/BirukBelihu/Glow)
![GitHub license](https://img.shields.io/github/license/BirukBelihu/Glow)
[![](https://jitpack.io/v/birukbelihu/Glow.svg)](https://jitpack.io/#birukbelihu/Glow)

# Glow 🌈

**Glow** is a lightweight, **markdown-style console text formatter** for Java. It enables developers to output styled text in the terminal using simple and readable tags like `[red bold]Error[/]`.

---

### ⭐ Features

- ✅ **Markdown-style tags**: `[red]`, `[green bold]`, `[italic underline]`
- 🎨 **Foreground & background colors with support for custom rgb & hexadecimal colors along with predefined colors**
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
     <version>Tag</version>
   </dependency>
   ```
---

## 🧩 Usage Example

```java
import com.biruk.glow.Glow;

public class Main {
   public static void main(String[] args){
      Glow.print("""
              [cyan bold]Glow[/] is a lightweight, [bold]markdown-style console text formatter[/] for Java. It enables developers to output styled text in the terminal using simple and readable tags like `[red bold]Error[/]`.
              """);
   }
}

```

### Tested and works on consoles with 24-bit true color support.

---

## 📦 Library Overview
| Function                                  | Description                                            |
|-------------------------------------------|--------------------------------------------------------|
| `Glow.parse(String text)`                 | Converts your markdown-style tags to ANSI-coded string |
| `Glow.print(String text)`                 | Prints without newline                                 |
| `Glow.println(String text)`               | Prints with newline                                    |
| `Glow.print(String text, String style)`   | Prints without newline with a provided style           |
| `Glow.println(String text, String style)` | Prints with newline with a provided style              |
| `Glow.RESET`                              | ANSI reset code                                        |
---

## 📄 Demo & Documentation

Check out the [Main](https://github.com/birukbelihu/Glow/blob/master/src/main/java/Main.java) class for:
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

---

## 📄 License

This project is licensed under the **Apache License 2.0**. See the [LICENSE](LICENSE) file for details.