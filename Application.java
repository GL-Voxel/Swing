import javax.swing.*;
import java.awt.event.*;

public class Application extends JFrame {

    static private JLabel objectToMove;

    Application() {
        super("Примите меня на работу?");
        setBounds(0, 0, 2000, 800);
        objectToMove = new JLabel(new ImageIcon("ShootingStar.png"));
        objectToMove.setBounds(0, 0, 500, 500);
        add(objectToMove);

    }

    public void Run(){
        addMouseListener(new Click());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }


    private class Click implements MouseListener {
        public void mouseEntered(MouseEvent mouseEvent){

        }

        @Override
        public void mouseClicked(MouseEvent mouseEvent){
            objectToMove.setLocation(mouseEvent.getX(), mouseEvent.getY());
        }

        public void mousePressed(MouseEvent mouseEvent){

        }

        public void mouseReleased(MouseEvent mouseEvent){

        }

        public void mouseExited(MouseEvent click){

        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.Run();
    }
}