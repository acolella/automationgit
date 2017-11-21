import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.Desktop;
import com.borland.silktest.jtf.common.types.MouseButton;
import com.borland.silktest.jtf.common.types.Point;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.xbrowser.DomListBox;
import com.borland.silktest.jtf.xbrowser.DomTextField;


public class criar_opo {

	private Desktop desktop = new Desktop();
	

	@Before
	public void baseState() {
		// Go to web page 'https://login.salesforce.com/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
		
	}

	@Test
	public void main() {
		
		//Maximiza a janela web
		desktop.<BrowserApplication>find("//BrowserApplication").maximize();
		
		//Realiza Login no Sistema Sales Force
		desktop.<DomTextField>find("login_salesforce_com.BrowserWindow.username").click(MouseButton.LEFT, new Point(171, 21));
		desktop.<DomTextField>find("login_salesforce_com.BrowserWindow.username").setText("nimcol-fjcg@force.com");
		desktop.<DomTextField>find("login_salesforce_com.BrowserWindow.password").setText("Acolell@20");
		desktop.<DomButton>find("login_salesforce_com.BrowserWindow.Login").click(MouseButton.LEFT, new Point(182, 37));
		
		//Verificar o ícone Sales Force na tela inicial
		DomElement userNavLabel = desktop.<DomElement>find("na73_salesforce_com.BrowserWindow.userNavLabel");
		Assert.assertEquals("menuButtonLabel", userNavLabel.getProperty("class"));	
		
		//Realiza o cadastro de uma nova oportunidade validando as informações finais.
		desktop.<DomLink>find("na73_salesforce_com.BrowserWindow.Oportunidades").click();
		desktop.<DomButton>find("na73_salesforce_com.BrowserWindow.new").click();
		desktop.<DomTextField>find("na73_salesforce_com.BrowserWindow.opp3").setText("SALESOPFORCE");
		desktop.<DomElement>find("na73_salesforce_com.BrowserWindow.lookupIcon").click();
		desktop.<DomTextField>find("na73_salesforce_com.BrowserWindow.opp4").setText("VERÃO");
		desktop.<DomListBox>find("na73_salesforce_com.BrowserWindow.opp5").select("New Business");
		desktop.<DomListBox>find("na73_salesforce_com.BrowserWindow.opp6").select("Partner");
		desktop.<DomTextField>find("na73_salesforce_com.BrowserWindow.opp14").setText("CADASTRO DE NOVA OPORTUNIDADE");
		desktop.<DomTextField>find("na73_salesforce_com.BrowserWindow.opp9").setText("18/10/2017");
		desktop.<DomTextField>find("na73_salesforce_com.BrowserWindow.opp12").setText("100");
		desktop.<DomTextField>find("na73_salesforce_com.BrowserWindow.opp7").setText("100000000");
		desktop.<DomListBox>find("na73_salesforce_com.BrowserWindow.opp11").select("Prospecting");
		desktop.<DomButton>find("na73_salesforce_com.BrowserWindow.save2").click();
		DomElement opp3_ileinner = desktop.<DomElement>find("na73_salesforce_com.BrowserWindow.opp3_ileinner");
		Assert.assertEquals(true, opp3_ileinner.isVisible());
		DomLink lookup0011I000005xl5 = desktop.<DomLink>find("na73_salesforce_com.BrowserWindow.lookup0011I000005xl5");
		Assert.assertEquals(true, lookup0011I000005xl5.isVisible());
		DomElement opp5_ileinner = desktop.<DomElement>find("na73_salesforce_com.BrowserWindow.opp5_ileinner");
		Assert.assertEquals(true, opp5_ileinner.isVisible());
		DomElement opp9_ileinner = desktop.<DomElement>find("na73_salesforce_com.BrowserWindow.opp9_ileinner");
		Assert.assertEquals(true, opp9_ileinner.isVisible());
		DomElement opp12_ileinner = desktop.<DomElement>find("na73_salesforce_com.BrowserWindow.opp12_ileinner");
		Assert.assertEquals(true, opp12_ileinner.isVisible());
		DomElement opp7_ileinner = desktop.<DomElement>find("na73_salesforce_com.BrowserWindow.opp7_ileinner");
		Assert.assertEquals(true, opp7_ileinner.isVisible());
		
	}

}