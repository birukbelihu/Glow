import com.biruk.glow.Glow;

public class Main {
    public static void main(String[] args){
        Glow.print("""
                [cyan bold]Glow[/] is a lightweight, [bold]markdown-style console text formatter[/] for Java. It enables developers to output styled text in the terminal using simple and readable tags like `[red bold]Error[/]`.
                """);

        Glow.println("[green]Success: [bold]42 tests passed![/]");

        Glow.println("[bg-yellow black italic]Warning:[/] Low disk space.");

        Glow.println("[red bold]Error:[/] Something went wrong!");

        Glow.print("""
                  ____   _
                 / ___| | |   ___   __      __
                | |  _  | |  / _ \\  \\ \\ /\\ / /
                | |_| | | | | (_) |  \\ V  V /
                 \\____| |_|  \\___/    \\_/\\_/
                """, "blue bold");

        Glow.println("BirukBelihu", "bold underline magenta");
        Glow.println("[bg-black cyan]This is a test of the Glow library.[/]");
    }
}
