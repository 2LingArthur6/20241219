import java.awt.*;
import java.awt.event.*;

public class S2 {
    public static void main(String[] args) {
        new EventExample(); // 啟動應用程式
    }
}

// 將 EventExample 定義為外部類
class EventExample extends Frame implements ActionListener, MouseListener {
    private Button button;
    private Label label;

    public EventExample() {
        // 設定視窗標題與大小
        setTitle("AWT Event Example");
        setSize(400, 200);
        setLayout(new FlowLayout());

        // 建立按鈕與標籤
        button = new Button("Click Me");
        label = new Label("No event triggered yet.");

        // 加入事件監聽器
        button.addActionListener(this); // 設定按鈕點擊事件
        addMouseListener(this); // 設定滑鼠事件

        // 將按鈕與標籤加入視窗
        add(button);
        add(label);

        // 關閉視窗的處理
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true); // 顯示視窗
    }

    // 處理按鈕點擊事件
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("Button was clicked!");
        }
    }

    // 滑鼠事件處理
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse entered the frame.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse exited the frame.");
    }
}
