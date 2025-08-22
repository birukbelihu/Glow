import com.biruk.glow.Glow;

public class Main {
    public static void main(String[] args){
        Glow.print("""
                [cyan bold]glow[/] is a lightweight, [bold]markdown-style console text formatter[/] for Java. It enables developers to output styled text in the terminal using simple and readable tags like `[red bold]Error[/]`.
                """);

        Glow.println("[green]Success: [bold]42 tests passed!!![/]");

        Glow.println("[bg-yellow black italic]Warning:[/] Low disk space.");

        Glow.println("[red bold]Error:[/] Something went wrong!");

        Glow.print("""
                
                """, "blue bold");

        Glow.println("Glow Java", "bold underline magenta");
        Glow.println("[bg-black cyan]This is a test of the Glow library.[/]");

        Glow.println("[rgb(255,56,0) italic underline]Red text[/]");
        Glow.println("[hex(#00FF00) bold dim bg-blue]Green text[/]");
    }
}
