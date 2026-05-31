
import javax.swing.*;
import java.awt.*;

public class GamersClubApp extends JFrame {

    public GamersClubApp() {
        setTitle("GamersClub");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color bg = new Color(15, 10, 35);
        Color card = new Color(35, 20, 60);
        Color purple = new Color(180, 120, 255);

        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setBackground(bg);

        JLabel title = new JLabel("🎮 GamersClub");
        title.setForeground(purple);
        title.setFont(new Font("Arial", Font.BOLD, 36));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextArea history = new JTextArea("""
HISTÓRIA DOS VIDEOJOGOS

• 1970 - Pong popularizou os arcades.
• 1980 - Pac-Man, Donkey Kong e Space Invaders marcaram a Era Dourada.
• 1990 - PlayStation e Nintendo 64 revolucionaram os gráficos 3D.
• 2000 - A internet trouxe os jogos online para milhões de jogadores.
• 2010 - eSports e streaming transformaram os jogos em espetáculo.
• 2020+ - IA, Realidade Virtual e Cloud Gaming redefinem a indústria.

Hoje existem mais de 3,2 mil milhões de jogadores no mundo.
""");

        history.setLineWrap(true);
        history.setWrapStyleWord(true);
        history.setEditable(false);
        history.setBackground(card);
        history.setForeground(Color.WHITE);

        JTextArea games = new JTextArea("""
TOP JOGOS

Minecraft
- Criatividade, construção e exploração.

Fortnite
- Popularizou os Battle Royale modernos.

League of Legends
- Um dos maiores eSports do planeta.

Counter-Strike 2
- FPS competitivo de enorme influência.

GTA V
- Referência em mundo aberto.
""");

        games.setEditable(false);
        games.setBackground(card);
        games.setForeground(Color.WHITE);

        JTextArea companies = new JTextArea("""
EMPRESAS

Nintendo
- Criadora de Mario, Zelda e Pokémon.

Sony PlayStation
- Uma das maiores fabricantes de consolas.

Microsoft Xbox
- Destaque para Game Pass e serviços online.

Valve
- Criadora do Steam e Counter-Strike.

Epic Games
- Fortnite e Unreal Engine.
""");

        companies.setEditable(false);
        companies.setBackground(card);
        companies.setForeground(Color.WHITE);

        JLabel stats = new JLabel(
            "📊 3.2 Bilhões de Jogadores | 210 Bilhões USD | Caminho para 1 Trilhão USD"
        );
        stats.setForeground(purple);
        stats.setAlignmentX(Component.CENTER_ALIGNMENT);

        main.add(Box.createVerticalStrut(20));
        main.add(title);
        main.add(Box.createVerticalStrut(20));
        main.add(new JScrollPane(history));
        main.add(Box.createVerticalStrut(15));
        main.add(new JScrollPane(games));
        main.add(Box.createVerticalStrut(15));
        main.add(new JScrollPane(companies));
        main.add(Box.createVerticalStrut(20));
        main.add(stats);

        JScrollPane scroll = new JScrollPane(main);
        setContentPane(scroll);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new GamersClubApp().setVisible(true);
        });
    }
}
