import javax.swing.JOptionPane;

public class noticesSeparatedOut {

	public noticesSeparatedOut() {
		super();
		
	}

	public int noticeYesNo(String showThis) {
		return JOptionPane.showConfirmDialog(null, null, showThis, JOptionPane.YES_NO_OPTION);
	}

	
}
