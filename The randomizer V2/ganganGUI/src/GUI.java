import javax.swing.*;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.util.Random;
import java.util.Random;


public class GUI implements ActionListener
{

    int count = 0;

    JLabel GunLabel;
    JLabel ArmourVestLabel;
    JLabel HelmetLabel;
    JLabel BackPackLabel;
    JLabel RigLabel;




        String Guns[] = {"none", "ADAR 2-15", "AK-101", "AK-102", "AK-103", "AK-104", "AK-105", "AK-74", "AK-74M", "AK-74N", "AKM", "AKMN", "AKMS", "AKMSN", "AKS-74", "AKS-74N",
                "AKS-74U", "AKS-74UB", "AKS-74UN", "ASh-12", "AS VAL", "Mk47", "DT MDR 5.56x45", "DT MDR .308", "HK 416A5", "Kel-Tec RFB 7.62x51", "M4A1", "MCX", "SA-58",
                "TX-15 DML", "Vepr AKM/VPO-209", "Vepr KM/VPO-136", "OP-SKS", "SKS", "Vepr Hunter", "RPK-16", "MP5", "MP5K-N", "MP7A1", "MP7A2", "MP9", "MP9-N",
                "MPX", "P90", "PP-19-01 Vityaz-SN", "PP-9 Klin", "PP-91 Kedr", "PP-91-01 Kedr-B", "PPSH-41", "Saiga-9", "STM-9", "UMP 45", "Vector .45", "Vector 9x19",
                "590A1", "M870", "MP-133", "MP-153", "MP-155", "Saiga-12", "TOZ-106", "KS-23M", "M1A", "Mk-18", "RSASS", "SR-25", "SVDS", "VSS Vintorez", "DVL-10", "M700",
                "Mosin", "Mosin Inf.", "SV-98", "T-5000", "VPO-215", "FN GL40", "APB", "APS", "FN 5-7", "GLOCK17", "GLOCK18C", "M1911A1", "M45A1", "M9A3", "MP-443 Grach",
                "P226R", "PB pistol", "PL-15", "PM (t) pistol", "PM pistol", "SR-1MP Gyurza", "TT pistol", "TT pistol (gold)"};

        String ArmourVests[] = {"none", "Module-3M", "PACA Soft Armor", "6B2 (Flora)", "MF-UNTAR", "6B23-1", "BNTI Kirasa-N", "NFM THOR Concealable Vest", "6B13", "6B23-2",
                "Highcom Trooper TFO", "BNTI Korund-VM", "FORT Redut-M", "6B13 M assault armor (tan)", "IOTV Gen4 armor (high mobility kit)", "BNTI Gzhel-K",
                "FORT Defender-2", "IOTV Gen4 (assault kit)", "IOTV Gen4 armor (full protection)", "FORT Redut-T5", "5.11 Hexgrid", "Zhuk-6a heavy armor",
                "LBT 6094A Slick Plate Carrier", "6B43 Zabralo-Sh 6A Armor"};

        String Backpack[] = {"none", "6SH118 raid backpack", "LBT-2670 Slim Field Med Pack", "Mystery Ranch Blackjack 50 backpack (multicam)", "Eberlestock F4 Terminator",
                "SSO Attack 2", "Pilgrim tourist backpack", "3V G Paratus 3-Day Operator's Tactical Backpack", "Eberlestock G2 Gunslinger II", "Oakley Mechanism",
                "Camelbak Tri-Zip", "Ana tactical Beta 2", "Eberlestock F5 Switchblade", "Hazard 4 Drawbridge", "Hazard4 Takedown", "Hazard4 Pillbox", "Wartech Berkut",
                "LBT-8005A Day Pack", "Scav Backpack", "Flyye MBSS", "Sanitar bag", "Duffle bag", "LK 3F Transfer tourist backpack", "Transformer Bag", "VKBO army",
                "Tactical sling bag"};

        String tacticalRig[] = {"none", "Scav Vest", "Security vest", "DIY IDEA", "Spiritus Systems Bank Robber", "SOE Micro Rig", "Wartech gear rig", "CSA chest rig", "UMTBS 6sh112",
                "Splav Tarzan", "Haley Strategic D3CRX", "Triton M43-A", "Blackhawk! Commando", "Direct Action Thunderbolt", "Gear Craft GC-BSS-MK1", "Umka М33-SET1",
                "LBT-1961A", "Stich Profi Chest Rig MK2", "Stich Profi Chest Rig MK2", "BlackRock", "Wartech MK3", "ANA Tactical Alpha", "Azimut SS Jhuk Chest",
                "Velocity Systems Multi-Purpose Patrol Vest", "Belt-A + Belt-B"};

        String Helmet[] = {"none", "Armasight NVG mask", "Wilcox Skull Lock head mount", "Tac-Kek Fast MT (non-ballistic replica)", "Soft tank crew helmet", "Kolpak-1S riot helmet",
                "SHPM Firefighter's helmet", "PSH-97 Djeta", "UNTAR helmet", "6B47 Ratnik-BSh", "LZSh light helmet", "SSh-68", "Kiver-M", "DEVTAC Ronin", "SSSh-95 Sfera-S",
                "MSA ACH TC-2001", "MSA ACH TC-2002", "MSA Gallet TC 800", "Highcom Striker ACHHC IIIA", "ZSh-1-2M", "Highcom Striker ULACH IIIA", "Diamond Age Bastion",
                "Ops-Core Fast MT SUPER HIGH CUT", "Crye Precision Airframe Tan", "Team Wendy EXFIL Ballistic (black)", "Team Wendy EXFIL Ballistic (white)", "Caiman",
                "BNTI LSHZ-2DTM", "Maska 1Sch (ugly)", "Maska 1Sch (killa)", "Altyn", "Rys-T", "Vulkan-5", "Door Kicker Boonie"};


        String gunTXT = ("Gun: " + Guns[new Random().nextInt(Guns.length)]);
        String armourTXT = ("Armour Vests: " + ArmourVests[new Random().nextInt(ArmourVests.length)]);
        String backpackTXT = ("Backpack: " + Backpack[new Random().nextInt(Backpack.length)]);
        String rigTXT = ("TacticalRig: " + tacticalRig[new Random().nextInt(tacticalRig.length)]);
        String helmetTXT = ("Helmet: " + Helmet[new Random().nextInt(Helmet.length)]);






    public GUI()
    {

        JFrame frame = new JFrame();

        JButton button = new JButton("Generate Kit");

        GunLabel = new JLabel("Gun: ");
        ArmourVestLabel = new JLabel("Armour Vests: ");
        HelmetLabel = new JLabel("Helmet: ");
        BackPackLabel = new JLabel("Backpack: ");
        RigLabel = new JLabel("TacticalRig: ");

        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 150, 300, 150));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(GunLabel);
        panel.add(HelmetLabel);
        panel.add(ArmourVestLabel);
        panel.add(RigLabel);
        panel.add(BackPackLabel);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("EFT Kit Randomizer");
        frame.pack();
        frame.setVisible(true);
    }



    public static void main(String[] args)
    {
        new GUI();
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        String gunTXT = ("Gun: " + Guns[new Random().nextInt(Guns.length)]);
        String armourTXT = ("Armour Vests: " + ArmourVests[new Random().nextInt(ArmourVests.length)]);
        String backpackTXT = ("Backpack: " + Backpack[new Random().nextInt(Backpack.length)]);
        String rigTXT = ("TacticalRig: " + tacticalRig[new Random().nextInt(tacticalRig.length)]);
        String helmetTXT = ("Helmet: " + Helmet[new Random().nextInt(Helmet.length)]);

        GunLabel.setText(gunTXT);
        HelmetLabel.setText(helmetTXT);
        ArmourVestLabel.setText(armourTXT);
        RigLabel.setText(rigTXT);
        BackPackLabel.setText(backpackTXT);

    }

}
