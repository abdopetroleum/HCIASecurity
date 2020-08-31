package com.example.hciasecurity.Logic;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.hciasecurity.Logic.MyQuestions;
import com.example.hciasecurity.Logic.Questions.MultipleChoice;
import com.example.hciasecurity.Logic.Questions.Question;
import com.example.hciasecurity.Logic.Questions.SingleChoice;
import com.example.hciasecurity.Logic.Questions.TrueAndFalse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
public class QuestionsFillers {
    private static ArrayList<TrueAndFalse> trueAndFalses;
    private static ArrayList<MultipleChoice> multipleChoices;
    private static  ArrayList<SingleChoice> singleChoices;
    public static String [] chapterNames={"General",
            "BasicConceptofInformationSecurity",
            "InformationSecurityStandardsandSpecifications",
            "BasicNetworkConcepts",
            "CommonNetworkDevices",
            "CommonInformationSecurityThreats",
            "ThreatDefenseandInformationSecurityDevelopmentTrends",
            "OperatingSystemOverview",
            "CommonServerTypesandThreats",
            "HostFirewallsandAntivirusSoftware",
            "IntroductiontoFirewalls",
            "NetworkAddressTranslation",
            "DualSystemHotStandby",
            "FireWallUserManagement",
            "OverviewofIntrusionPrevention",
            "EncryptionandDecryptionMechanism",
            "PKICertificateSystem",
            "ApplicationofCryptographicTechnologies",
            "IntroductiontoSecurityOperations",
            "DataMonitoringandAnalysis",
            "DigitalForensics",
            "CybersecurityEmergencyResponse"
    };
    enum ChapterName{
        BasicConceptofInformationSecurity(1),
        InformationSecurityStandardsandSpecifications(2),
        BasicNetworkConcepts(3),
        CommonNetworkDevices(4),
        CommonInformationSecurityThreats(5),
        ThreatDefenseandInformationSecurityDevelopmentTrends(6),
        OperatingSystemOverview(7),
        CommonServerTypesandThreats(8),
        HostFirewallsandAntivirusSoftware(9),
        IntroductiontoFirewalls(10),
        NetworkAddressTranslation(11),
        DualSystemHotStandby(12),
        FireWallUserManagement(13),
        OverviewofIntrusionPrevention(14),
        EncryptionandDecryptionMechanism(15),
        PKICertificateSystem(16),
        ApplicationofCryptographicTechnologies(17),
        IntroductiontoSecurityOperations(18),
        DataMonitoringandAnalysis(19),
        DigitalForensics(20),
        CybersecurityEmergencyResponse(21);
        private int number;
        ChapterName(int number){
            this.number=number;
        }
        public int getNumber(){
            return number;
        }
    }

    public static void initialize(){
        trueAndFalseFillers();
        singleChoicesFillers();
        multipleChoiceFillers();
    }
    private static void trueAndFalseFillers(){
        trueAndFalses=new ArrayList<TrueAndFalse>();
        trueAndFalses.add(new TrueAndFalse(
                "IPSec VPN uses an asymmetric encryption algorithm to encrypt the transmitted data",
                false,
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "The network administrator can collect data to be analyzed on the network device by means of packet capture, port mirroring, or log, etc",
                true,
                ChapterName.DataMonitoringandAnalysis.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "The world's first worm \"Morris worm\" made people realize that as people become more dependent on computers, the possibility of computer networks being attacked increases, and it is necessary to establish a comprehensive emergency response system.",
                true,
                ChapterName.CommonInformationSecurityThreats.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "When the sesson authentication mode is used to trigger the firewall's built-in Portal aithentication. the user does not actively perform identity authentication, advanced service access, and device push \"redirect\" to the authentication page?",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "The tunnel addresses at both ends ofthe GRE tunnel can be configured as addresses of different network segments",
                true,
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Information security level protection is the basic system of national information security work",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "If the company structure has undergone a practical change, it is necessary to retest whether the business continuity plan is feasible",
                true,
                ChapterName.IntroductiontoSecurityOperations.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "HTTP packets are carried by UDP. and the HTTPS protocol is based on TCP three-way handshake. Therefore. HTTPS is relatively secure, and HTTPS is recommended.",
                false,
                ChapterName.BasicNetworkConcepts.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "The single-point login function of the online user, the user authenticates directly to the AD server, and the device does not interfere with the user authentication process. The AD monitoring service needs to be deployed on the USG device to mcnitorthe authentication information of the AD server",
                false,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "UDP port scanning means that the attacker sends a zero-byte UDP packet to a specific port of the target host. If the port is open, it will return an ICMP port reachable data packet",
                false,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Social engineering is a means of harm such as deception, injury, etc. through psychological traps such as psychological weakness, instinctive reaction, curiosity, trust, and greed",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Device destruction attacks are generally not easy to cause information leakage, but usually cause network communication services to be interrupted",
                true,
                ChapterName.CommonInformationSecurityThreats.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "NAT technology can securely transmit data by encrypting data",
                false,
                ChapterName.NetworkAddressTranslation.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Encryption technology can transform readable information into unreadable information in a certain way",
                true,
                ChapterName.EncryptionandDecryptionMechanism.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Antivirus software and host firewall have the same effect",
                false,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "The process of electronic forensics includes: protecting the site, obtaining evidence, preserving evidence, identifying evidence, analyzing evidence, tracking and presenting evidence",
                true,
                ChapterName.DigitalForensics.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "In the USG series firewall system view, the device configuration will be restored to the default configuration after the reset saved-configuration command is executed. No other operations are required",
                false,
                ChapterName.CommonNetworkDevices.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "The host firewall is mainly used to protect the host from attacks and intrusions from the network",
                false,
                ChapterName.CommonNetworkDevices.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "On the USG series firewalls, the default security policy does not support modification",
                false,
                ChapterName.IntroductiontoFirewalls.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "NAPT technology can implement a public network IP address for multiple private network hosts",
                true,
                10
        ));

        trueAndFalses.add(new TrueAndFalse(
                "After the firewall uses the hrp standby config enable command to enable :he standby device configuration function all the information that can be backed up can be directly configured on the standby device, and the configuration on the standby device can be synchronized to the active device. " ,
                true,
                12
        ));

        trueAndFalses.add(new TrueAndFalse(
                "Intrusion Prevention System (IPS) is a defense system that can block in real time when an intrusion is discovered ",
                true,
                14
        ));

        trueAndFalses.add(new TrueAndFalse(
                "IPSec VPN uses an asymmetric encryption algorithm to encrypt the transmitted data  ",
                false,
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                "Digital certificates are fair to public keys through third-party agencies, thereby ensuring the non-repudiation of data transmission. Therefore, to confirm the correctness of the public key, only the certificate of the communicating party is needed. ",
                false,
                0
        ));

        trueAndFalses.add(new TrueAndFalse(
                "Digital signatures are used to generate digital fingerprints by using a hashing algorithm to ensure the integrity of data transmission ",
                true,
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                "The SIP protocol establishes a session using an SDP message, and the SDP message contains a remote address or a multicast address ",
                true,
                0
        ));

        trueAndFalses.add(new TrueAndFalse(
                "Digital certificates can be divided into local certificates. CA certificates, root certificates and self-signed certificates according to different usage scenarios ",
                true,
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                "In the VRRP (Virtual Router Redundancy Protocol) group, the primary firewall periodically sends advertisement packets to the backup firewall. The backup firewall is only responsible for monitoring advertisement packets and will not respond. ",
                true,
                ChapterName.DualSystemHotStandby.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                "The VRRP advertisement packet of the Huawei USG firewall is a multicast packet. Therefore, each firewall in the backup group must be able to implement direct Layer 2 interworking ",
                true,
                ChapterName.DualSystemHotStandby.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                " Because the server is a kind of computer, we can use our pc in the enterprise as our server, ",
                false,
                0
        ));

        trueAndFalses.add(new TrueAndFalse(
                "In the security assessment method, the purpose ofthe security scan is to scan the target system with a scan analysis evaluation tool to discover related vulnerabilities and prepare for the attack. ",
                false,
                ChapterName.IntroductiontoSecurityOperations.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                "In the construction of information security system, the security model is needed to accurately describe the relationship between important aspects of security and system behavior ",
                false,
                0
        ));

        trueAndFalses.add(new TrueAndFalse(
                " Security policy conditions can be divided into multiple fields, such as source address, destination address, source port, destination port, etc. These fields are \"and\", that is, only information in the packet match all fields, and then hit this policy",
                false,
                ChapterName.IntroductiontoFirewalls.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                "The matching principle of the security policy is: firstly, find the inter-domain security policy configured manually, and if there is no match, the data packet is directly discarded ",
                true,
                ChapterName.IntroductiontoFirewalls.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                "Digital signature is to achieve the integrity of data transmission by using a hash algorithm to generate digital fingerprints",
                true,
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                " OSPF is more commonly used than RIP because OSPF has device authenticatior and is more secure ",
                false,
                ChapterName.BasicNetworkConcepts.number
        ));



        trueAndFalses.add(new TrueAndFalse(
                " After the firewall uses the hrp standby config enable command to enable the standby device configuration function, all the information that can be backed up can be directly configured on the standby device, and the configuration on the standby device can be synchronized to the active device. ",
                true ,
                ChapterName.DualSystemHotStandby.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                ". In practical applications, asymmetric encryption is mainly used to encrypt user data ",
                false,
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                " When establishing their own information systems, companies check each operation according to internationally established authoritative standards and can check whether their information systems are safe ",
                true,
                0
        ));
        // manar start
        trueAndFalses.add(new TrueAndFalse(
                "Caesar Code is primarily used to encrypt data by using a stick of a specific specification",
                false,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                " In the Client-Initiated VPN configuration, generally it is recommended to plan the address pool and the headquarters or need to of the network address for the different network or need to open proxy forwarding on the gateway device",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Except built-in Portal authentication, firewall also supports custom Portal authentication, when using a custom Portal authentication, no need to deploy a separate external Portal sever.",
                false,
                ChapterName.CommonNetworkDevices.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                " IPSec VPN technology does not support NAT traversal when encapsulating with ESP security protocol, because ESP encrypts the packet header",
                false,
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));
        trueAndFalses.add(new TrueAndFalse(
                " NAPT technology can implement a public network IP address for multiple private network hosts",
                true,
                ChapterName.NetworkAddressTranslation.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "When configuring security policy, a security policy can reference an address set or configure multiple destination IP addresses.",
                true,
                ChapterName.IntroductiontoFirewalls.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                " ‘Being good at observation’ and 'keeping suspicion’ can help us better identify security threats in the online world.",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                " Under the tunnel encapsulation mode. IPSec configuration does not need to have a route to the destination private network segment, because the data will be re-encapsulated using the new IP header to find the routing table.",
                false,
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                " Common scanning attacks include: port scanning tools, vulnerability scanning tools, application scanning tools, database scanning tools, etc",
                true,
                ChapterName.DataMonitoringandAnalysis.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "IPS (Intrusion Prevention System) is a defense system that can block in real time when intrusion is discovered",
                true,
                ChapterName.OverviewofIntrusionPrevention.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                " Digital certificates can be divided into local certificates, CA certificates, root certificates, and self-signed certificates according to different usage scenarios",
                true,
                ChapterName.PKICertificateSystem.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "The European TCSEC Code is divided into two modules, Function and Evaluation, which are mainly used in the miitary, government and commercial fields\n",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "To implement the \" anti-virus function \" in the security policy, you must perform a License activation",
                true,
                ChapterName.IntroductiontoFirewalls.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "On the surface, threats such as viruses, vulnerabilities, and Trojans are the cause of information security incidents, but at the root of it, information security incidents are also strongly related to people and information systems themselves.",
                true,
                ChapterName.CommonInformationSecurityThreats.number
        ));
        //manar end

        //mona start
        trueAndFalses.add(new TrueAndFalse(
                "IPSec VPN uses an asymmetric encryption algorithm to encrypt the transmitted data",
                false,
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));

        trueAndFalses.add(new TrueAndFalse(
                "The repair of anti-virus software only needs to be able to repair some system files that were accidentally deleted when killing the virus to prevent the system from crashing",
                true,
                0
        ));

        trueAndFalses.add(new TrueAndFalse(
                "Security policy conditions can be divided into multiple fields, such as source address, destination address, source port, destination port, etc. These fields are \"and \" , that is, only information in the message and all fields If you match, you can hit this strategy",
                false,
                ChapterName.IntroductiontoFirewalls.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "The vulnerability that has not been discovered is the 0 day vulnerability",
                false,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Firewall update signature database and Virus database online through security service center, requires the firewall can connect to the Internet first, and then need to configure the correct DNS addresses.",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "In information security prevention, commonly used security products are firewalls, Anti-DDos devices and IPS/IDS devices.",
                true,
                ChapterName.CommonNetworkDevices.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "If the administrator uses ’he default authentication domain to authenticate a user, you only need to enter a user name when the user logs, if administrators use the newly created authentication domain to authenticate the user, the user will need to enter login \"username @ Certified domain name\"",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Digital certificate technology solves the problem that public key owners cannot determine in digital signature technology.",
                true,
                ChapterName.EncryptionandDecryptionMechanism.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "IPSEC VPN technology does not support NAT traversal when encapsulated in ESP security protocol because ESP encrypts the packet header",
                false,
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        trueAndFalses.add(new TrueAndFalse(
                "Using a computer to store information about criminal activity is not a comouter crime",
                false,
                0
        ));

        trueAndFalses.add(new TrueAndFalse(
                "Information security level protection is to improve the overall national security level, while rationally optimizing the distribution of security resources, so that it can return the greatest security and economic benefits",
                true,
                0
        ));
        trueAndFalses.add(new TrueAndFalse(
                "For the occurrence of network security incidents, the remote emergency response is generally adopted first. If the problem cannot be solved for the customer through remote access, after the customer confirms, it is transferred to the local emergency response process.",
                true,
                0
        ));
        //mona end
    }

    private static void singleChoicesFillers(){
        singleChoices=new ArrayList<SingleChoice>();
        singleChoices.add(new SingleChoice(
                "Which of the following is not included in the steps of tie safety assessment method?",
                "Data analysis",
                new LinkedList<String>(){
                    {
                        add("Questionnaire survey");
                        add("Penetration test");
                        add("Manual audit");
                        add("Questionnaire");
                        add("Security Scan");
                    }
                },
                ChapterName.DataMonitoringandAnalysis.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is correct about firewall IPSec policy?",
                "By default. IPSec policy only controls unicast packets",
                new LinkedList<String>(){
                    {
                        add("By default, IPSec policy can control multicast");
                        add("By default, IPSec policy can control unicast packets and broadcast packets");
                        add("By default, IPSec policy can control unicast packets, broadcast packets, and multicast packets");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is the default backup method for double hot standby?",
                "Automatic backup",
                new LinkedList<String>(){
                    {
                        add("Manual batch backup");
                        add("Session fast backup");
                        add("Configuration of the active and standby FWs after the device is restarted");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following description is wrong aoout the intrusion detection system?",
                "Intrusion detection system includes all hardware and software systems for intrusion detection",
                new LinkedList<String>(){
                    {
                        add("The intrusion detection system can dynamically collect a large amount of key information 3nd materials through the network and computer, and can timely analyze and judge the current state of the entire system environment.");
                        add("The intrusion detection system can perform blocking operation if it finds that there is a violation of the security policy or the system has traces of being attacked.");
                        add("The flood detection system can be linked with firewalls and switches to become a powerfu 'helper' of the firewall, which is better and more precise to control traffic access between domains.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Regarding Ihe description of the packe: in the iptables transmission process, which of the following option is wrong?",
                "If the destination address of the packet is not local, the system sends the packet to the OUTPUT chain.",
                new LinkedList<String>(){
                    {
                        add("When a packet enters the network card, it first matches the PREROUTING chain");
                        add("If the destination address of the packet is local, the packet will be sent to the INPUT chain");
                        add("If the destination address of the packet is not local, the system sends the packet to the FORWARD chain");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following description is wrong about the operating system?",
                "The interface between the operating system and the user is a graphical interface",
                new LinkedList<String>(){
                    {
                        add("The operating system is the interface between the user and the computer");
                        add("The operating system is responsible for managing the execution of all hardware resources and control software of the computer system");
                        add("The operating system itself is also a software");
                    }
                },
                ChapterName.DataMonitoringandAnalysis.number
        ));
        singleChoices.add(new SingleChoice(
                "Manual auditing is a supplement to tool evaluation. It does not require any software to be installed on the target system being evaluated, and has no effect on the operation and status of the target system. Which of the following options does not include manual auditing?",
                "Manual inspection of the administrator's operation of the equipment process",
                new LinkedList<String>(){
                    {
                        add("Manual detection of the host operating system");
                        add("Manual inspection of the database");
                        add("Manual inspection of network equipment");
                    }
                },
                ChapterName.OperatingSystemOverview.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following descriptions is wrong ebout the source of electron c evidence?",
                "Movies and TV shows belong to electronic evidence related to network technology",
                new LinkedList<String>(){
                    {
                        add("Database opera’.ion records, operating system logs are computer-related electronic evidence");
                        add("Fax data, mobile phone recording is an electronic evidence related to communication technology");
                        add("Operating system, e-mail, chat records car be used as a source of electronic evidence");
                    }
                },
                ChapterName.OperatingSystemOverview.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following description is correct about the sort of the call setup process for L2TP corridors?\n" +
                        "1. L2TP tunnel 2. PPP connection\n" +
                        "3. LNS authenticates users 4. Users access intranet resources\n" +
                        "5. Establish an L2TP session",
                "1->5->3->2->4",
                new LinkedList<String>(){
                    {
                        add("1->2->3->5->4");
                        add("1->4->3->5->2");
                        add("2->1->5->3->4 ");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        singleChoices.add(new SingleChoice(
                "The Protocol field in the IP header identifies the protocol used by the upper layer. Which of the following field values indicates that the upper layer protocol is UDP protocol?",
                "17",
                new LinkedList<String>(){
                    {
                        add("6");
                        add("11");
                        add("18");
                    }
                },
                ChapterName.BasicNetworkConcepts.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is not the identity of the IPSec SA?",
                "Source address",
                new LinkedList<String>(){
                    {
                        add("Destination address");
                        add("spi");
                        add("Security policy");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        singleChoices.add(new SingleChoice(
                "Apply for emergency response special funds, which stage work content does procurement emergency response software and hardware equipment belong to in the network full emergency response?",
                "Preparation stage",
                new LinkedList<String>(){
                    {
                        add("Inhibition phase");
                        add("Response phase");
                        add("Recovery phase");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following description is wrong about the Internet users and VPN access user authentication?",
                "After the VPN access user passes the authentication, it will be online on the user online list",
                new LinkedList<String>(){
                    {
                        add("After the VPN user accesses the network, it can access the network resources of the enterprise headquarters. The firewall can control the accessible network resources based on the user name");
                        add("The local authentication or server authentication process is basically the same for the Internet users. The authentication is performed on the user through the authentication domain.");
                        add("The Internet user and the VPN access user share data, and the users attribute check (user status, account expiration time, etc.) also takes effect on the VPN access.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following descriptions about the patch is wrong?",
                "No patching does not affect the operation of the system, so it is irrelevant whether to patch or not.",
                new LinkedList<String>(){
                    {
                        add("Patch is a small program made by the original author of the software for the discovered vulnerability.");
                        add("Patches are generally updated.");
                        add("Computer users should download and install new patches to protect their systems in a timely manner");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following description is wrong about the Intrusion Prevention System (IPS)?",
                "IPS devices cannot be bypassed in the network",
                new LinkedList<String>(){
                    {
                        add("IDS devices need to be linked to the firewall to block the intrusion");
                        add("IPS devices can be cascaded at the network boundary and deployed online");
                        add("IPS devices can be blocked in real time once they detect intrusion");
                    }
                },
                ChapterName.OverviewofIntrusionPrevention.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following options does not belong to the log type of the Windows operating system?",
                "Business log",
                new LinkedList<String>(){
                    {
                        add("Application log");
                        add("Security log");
                        add("System log");
                    }
                },
                ChapterName.DataMonitoringandAnalysis.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is wrong about the scanning of vulnerabilities?",
                "Vulnerabilities can be avoided",
                new LinkedList<String>(){
                    {
                        add("The vulnerability was discovered beforehand and discovered afterwards");
                        add("Vulnerabilities are generally repairable");
                        add("Vulnerabilities are security risks that can expose computers to hackers");
                    }
                },
                ChapterName.CommonInformationSecurityThreats.number
        ));
        singleChoices.add(new SingleChoice(
                    "When the user single sign-on is configured, the receiving PC message mode is adopted. The authentication process has the following steps: 1 The visitor PC executes the login script and sends the user login information to the AD monitor 2 The firewall extracts the correspondence between the user and the IP from the login information. Add to the online user table 3 AD monitor connects to the AD server to query the login user information, and f?rwards the queried user information to the firewall. 4 The visitor logs in to the AD domain. The AD server returns the login success message to the user and delivers the login script, which of the following order is correct?",
                "4-1-3-2",
                new LinkedList<String>(){
                    {
                        add("1-2-3-4");
                        add("3-2-1-4");
                        add("1-4-3-2");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "The administrator wants to create a web configuration administrator, and set the Https device management port number to 20000, and set the administrator to the administrator level, which of the following commands are correct?",
                "Stepl: web-manager security enable port 20000 Step2: AAA View [USG] aaa [USG aaa] manager-user client001 [USG-aaa-manager-user-client001] service-type web [USG-aaa-manager-user-client001] level 15 [USG-aaa- manager-user-client001] password cipher Admin@123",
                new LinkedList<String>(){
                    {
                        add("Stepl: web-manager enable port 20000 Step2. AAA View [USG] aaa [USG aaa] manager-user clientO01 [USG-aaa-manager-user-client001] service-type web [USG-aaa-manager-user-client001] password cipher Admin@123");
                        add("Stepl: web-manager security enable port 20000 Step2: AAA View [USG] aaa [USG aaa] manager-user client001 [USG-aaa-manager-user-client001] service-type web [USG-aaa manager-user-client001] password cipher");
                        add("Stepl: web-manager security enable port 20000 Step2: AAA View [USG] aaa [USG aaa] manager-user client001 [USG-aaa-manager-user-client001] service-type web [USG-aaa-manager-user-client001] level 1 [USG-aaa- manager-user-client001] password cipher Admin@123");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is the correct order for event response management?\n" +
                        "1 detection 2 report\n" +
                        "3 relief 4 summarizing experience\n" +
                        "5 repair 6 recovery 7 response",
                "1-7-3-2-5-4",
                new LinkedList<String>(){
                    {
                        add("1-2-3-7-5-6-4");
                        add("1-3-2-7-5-6-4");
                        add("1-3-2-7-5-6-4");
                    }
                },
                ChapterName.IntroductiontoSecurityOperations.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following statement is wong about L2TP VPN?",
                "Belongs to Layer 3 VPN technology",
                new LinkedList<String>(){
                    {
                        add("Applicable to business employees dialing access to the intranet");
                        add("Will not encrypt the data");
                        add("Can be used in conjunction with IPsec VPN");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is not the scope of business of the National Internet Emergency Center?",
                "Cooperate with other agencies to provide training services",
                new LinkedList<String>(){
                    {
                        add("Emergency handling of security incidents");
                        add("Early warning rotification of security incidents");
                        add("Providing security evaluation services for government departments, enterprises and institutions");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Digital signature technology obtains a digital signature by encrypting which of the following data?",
                "Digital fingerprint",
                new LinkedList<String>(){
                    {
                        add("User data");
                        add("Receiver public key");
                        add("sender public key");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is the analysis layer device in the Huawei SDSec solution?",
                "Firehunter",
                new LinkedList<String>(){
                    {
                        add("cis");
                        add("Agile Controller");
                        add("switch");
                    }
                },
                0
        ));
        //eman

        singleChoices.add(new SingleChoice(
                "Regarding the HRP master and backup configuration consistency check content, which of the following is not included? ",
                "Next hop and outbound interface of static route",
                new LinkedList<String>(){
                    {
                        add("NAT policy ");
                        add("Is the heartbeat interface configured with the same serial number? ");
                        add("Authentication Policy");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following statement about the NAT configuration is wrong? ",
                "The firewall does not support NAPT conversion for ESP and AH packets.",
                new LinkedList<String>(){
                    {
                        add("Configure source NAT in -.transparent mode, the firewall does not support easy-ip mode ");
                        add("The IP address in the address pool can overlap with the public IP address of the NAT server ");
                        add("When there is VoIP service in the network, you do not need to configure NAT ALG  ");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));



        singleChoices.add(new SingleChoice(
                "After the network attack event occurs, set the isolation area, summary data, and estimated loss according to the plan. Which stage does the above actions belong to the work contents of in the network security emergency response?",
                "Inhibition phase",
                new LinkedList<String>(){
                    {
                        add("Preparation stage ");
                        add("Detection phase ");
                        add("Recovery phase ");
                    }
                },
                0



        ));



        singleChoices.add(new SingleChoice(
                "Which of the following attacks is not a cyber-attack? ",
                "MAC address spoofing attack ",
                new LinkedList<String>(){
                    {
                        add("IP spoofing attack ");
                        add("Smurf attack ");
                        add("ICMP attack ");
                    }
                },
                ChapterName.CybersecurityEmergencyResponse.number



        ));



        singleChoices.add(new SingleChoice(
                "About the description about the preemption function of VGMP management, which of the following statements is? wrong? ",
                "By default, the preemption delay of the VGMP management group is 40s.",
                new LinkedList<String>(){
                    {
                        add("By default, the preemption function of the VGMP management group is enabled. ");
                        add("Preemption means that when the faulty primary device recovers, its priority will be restored. At this time, it can regain its own state. ");
                        add("After the VRRP backup group is added to the VGMP management group, the original preemption function on the VRRP backup group is invalid. ");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));



        singleChoices.add(new SingleChoice(
                "In the IPSec VPN transmission mode, which part ofthe data packe: is encrypted?",
                "Transport layer and upper layer data packet",
                new LinkedList<String>(){
                    {
                        add("Network layer and upper layer data packet ");
                        add("Original IP packet header ");
                        add("New IP packet header ");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number



        ));


        singleChoices.add(new SingleChoice(
                "Which of the following descriptions about windows logs is wrong? ",
                "Windows server 2008 system logs stored in the Application.evtx",
                new LinkedList<String>(){
                    {
                        add("The system log is used to record the events generated by the operating system components, including the crash of the driver, system components and application software, and data ");
                        add("The application log contains events logged by the application or system program, mainly recording events in the running of the program");
                        add("Windows seiver 2008 security lug is sluied in security.evtx ");
                    }
                },
                ChapterName.DataMonitoringandAnalysis.number
        ));


        singleChoices.add(new SingleChoice(
                "Against IP Spoofing, which of the following description is wrong? ",
                "Af-.er IP spoofing attack is successful, the attacker can use forged any IP address to imitate legitimate hast to access to critical information ",
                new LinkedList<String>(){
                    {
                        add("IP spoofing is to use the hosts' normal trust relationship based on the IP address to launch it");
                        add("An attacker would need to cisguise the source IP addresses as trusted hosts, and send the data segment with the SYN flag request for connection ");

                    }
                },
                ChapterName.CommonInformationSecurityThreats.number



        ));

        singleChoices.add(new SingleChoice(
                "In the USG series firewall, which of the following commands can be used to query the NAT translation result? ",
                "display firewall session table ",
                new LinkedList<String>(){
                    {
                        add(" display nat translation ");
                        add(" display current nat ");
                        add(" display firewall nat translation ");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));

        singleChoices.add(new SingleChoice(
                "The preservation of electronic evidence is directly related to the legal effect of evidence, and it is in conformity with the preservation of legal procedures, and its authenticity and reliability are guaranteed. Which of the following is not an evidence preservation technique? ",
                "Packet tag tracking technology",
                new LinkedList<String>(){
                    {
                        add("Encryption technology");
                        add("Digital certificate technology");
                        add("Digital signature technology ");
                    }
                },
                0

        ));

        singleChoices.add(new SingleChoice(
                "Which of the following statements about IPSec SA is true? ",
                "IPSec SA is two-way",
                new LinkedList<String>(){
                    {
                        add("IPSec SA is one-way ");
                        add("used to generate an encryption key ");
                        add("Used to generate a secret algorithm ");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number



        ));

        singleChoices.add(new SingleChoice(
                "Which of the following does not include the steps of the safety assessment method?",
                " Data analysis",
                new LinkedList<String>(){
                    {
                        add("Manual audit ");
                        add("Penetration test I- ");
                        add("Questionnaire survey");
                    }
                },
                ChapterName.IntroductiontoSecurityOperations.number
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following guarantees \"should detect and protect spam at critical network nodes and maintain upgrades and updates of the spam protection mechanism\" in security 2.0? ",
                "Malicious code prevention ",
                new LinkedList<String>(){
                    {
                        add("Communication transmission");
                        add("Centralized control ");
                        add("Border protection ");
                    }
                },
                0
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following is not in the quintuple range? ",
                "Source MAC ",
                new LinkedList<String>(){
                    {
                        add("Source IP ");
                        add("Destination IP ");
                        add("Destination port ");
                    }
                },
                ChapterName.BasicNetworkConcepts.number



        ));

        singleChoices.add(new SingleChoice(
                "In stateful inspection firewall, when opening state detection mechanism, three-way handshake's second packet (SYN + ACK) arrives the firewall. If there is still no corresponding session table on the firewall, then which of the following statement is correct? ",
                " Packets must not pass through the firewall",
                new LinkedList<String>(){
                    {
                        add(" If the firewall security policy allows packets through, then the packets can pass through the firewall");
                        add(" If the firewall security policy allows packets through, then creating the session table ");
                        add(" Packets must pass through the firewall, and establishes a session table ");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number



        ));

        singleChoices.add(new SingleChoice(
                "Which of the following types of attacks does the DDos attack belong to? ",
                "Traffic attack ",
                new LinkedList<String>(){
                    {
                        add("Snooping scanning attack ");
                        add("Malformed packet attack ");
                        add("Special packet attack ");
                    }
                },
                ChapterName.CommonInformationSecurityThreats.number

        ));

        singleChoices.add(new SingleChoice(
                "In the USG system firewall, the________function can be used to provide well-known application services for non-known ports.",
                "Port mapping ",
                new LinkedList<String>(){
                    {
                        add("MAC and IP address binding ");
                        add("Packet filtering ");
                        add("Long connection ");
                    }
                },
                ChapterName.NetworkAddressTranslation.number



        ));

        singleChoices.add(new SingleChoice(
                "Which of the following is correct for the command to view the number of security pclicy matches? ",
                "display security-policy all ",
                new LinkedList<String>(){
                    {
                        add("display firewall sesstion table ");
                        add("display security-policy count");
                        add("count security-policy hit ");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following belongs to Layer 2 VPN technology? ",
                "L2TP VPN ",
                new LinkedList<String>(){
                    {
                        add("SSL VPN ");
                        add("GRE VPN ");
                        add("IPSec VPN ");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following description about the group management for VGMP is wrong",
                "The interface type and number of two firewalls heartbeat port may be different, as long as they can communicate with each other ",
                new LinkedList<String>(){
                    {
                        add("Master/slave status change of VRRP backup group needs to notify its VGMP management group ");
                        add("Periodically sends Hello packets between VGMP of master/slave firewall ");
                        add(" master/slave devices exchange packets to understand each other through the heartbeat line, and backup the related commands and status information ");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));

        singleChoices.add(new SingleChoice(
                " Which of the following attacks is not a malformed packet attack? ",
                "ICMP unreachable packet attack ",
                new LinkedList<String>(){
                    {
                        add("Teardrop attack ");
                        add("Smurf attack ");
                        add("TCP fragmentation attack ");
                    }
                },
                0
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following descriptions about IKE SA is wrong? ",
                "The encryption algorithm used by user data packets is determined by IKE SA.",
                new LinkedList<String>(){
                    {
                        add("IKE SA is two-way ");
                        add("IKE is a UDP- based application layer protocol ");
                        add("IKE SA servers for IPSec SA ");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following statement is wrong about NAT? ",
                "For some non-TCP. UDP protocols (such as ICMP. PPTP), unable to do NAT. ",
                new LinkedList<String>(){
                    {
                        add("Configure a NAT address pool in the source NAT technology. You can configure only one IP address in the address pool");
                        add("Address Translation can follow the needs of users, providing FTP. WWW, Telnet and other services outside the LAN ");
                        add("Some application layer protocols carry IP address information in the data, but also to modify the data in the upper layer of the IP address information when they make NAT ");
                    }
                },
                 ChapterName.NetworkAddressTranslation.number
        ));

        singleChoices.add(new SingleChoice(
                "When the NAT server is configured on the USG system firewall, a server-map table is generated. Which of the following does not belong to the content in the performance? ",
                "Source IP ",
                new LinkedList<String>(){
                    {
                        add("Destination IP ");
                        add("Destination port number ");
                        add("Protocol number ");
                    }
                },
                ChapterName.NetworkAddressTranslation.number



        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is not a hash algorithm? ",
                "SM1 ",
                new LinkedList<String>(){
                    {
                        add("MD5 ");
                        add("SHA1 ");
                        add("SHA2");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        singleChoices.add(new SingleChoice(
                " Which of the following is not the certificate save file format supported by the USG6000 series? ",
                "PKCS# ",
                new LinkedList<String>(){
                    {
                        add("PKCS#12 ");
                        add("DER ");
                        add("PEM");
                    }
                },
                ChapterName.PKICertificateSystem.number
        ));

        singleChoices.add(new SingleChoice(
                " Which of the following is used to encrypt digital fingerprints in digital signature technology? ",
                "sender private key ",
                new LinkedList<String>(){
                    {
                        add("sender public key ");
                        add(" Receiver public key ");
                        add(" Receiver private key ");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        singleChoices.add(new SingleChoice(
                "The content of intrusion detection covers authorized and unauthorized intrusions. Which of the following is not in the scope of intrusion detection? ",
                "Administrator mistakenly delete configuration ",
                new LinkedList<String>(){
                    {
                        add("Pretending to be another user ");
                        add("Planting worms and Trojans ");
                        add("Leaking data information ");
                    }
                },
                ChapterName.OverviewofIntrusionPrevention.number
        ));

        singleChoices.add(new SingleChoice(
                " For the description of ARP spoofing attacks, which the following statements is wrong? ",
                " ARP spoofing attacks can only be implemented through ARP replies and cannot be implemented through ARP requests ",
                new LinkedList<String>(){
                    {
                        add("The ARP implementation mechanism only considers the normal interaction of the service and does not verify any abnormal business interactions or malicious behaviors");
                        add("When a host sends a normal ARP request, the attacker will respond preemptively, causing the host to establish an incorrect IP and MAC mapping relationship.");
                        add("ARP static binding is a solution to ARP spoofing attacks. It is mainly applied to scenarios where the network size is small");
                    }
                },
                0



        ));

        singleChoices.add(new SingleChoice(
                " Which of the following is the port number used by L2TP packets? ",
                " 1701 ",
                new LinkedList<String>(){
                    {
                        add("17");
                        add("500");
                        add("4500 ");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));
        // eman end
        //start manar
        singleChoices.add(new SingleChoice(
                "Which of the following is the core part of the P2DR model?",
                "Policy Strategy",
                new LinkedList<String>(){
                    {
                        add("Protection");
                        add("Detection");
                        add("Response");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following types of attacks does the DDoS attack belong to?",
                "Traffic attack",
                new LinkedList<String>(){
                    {
                        add("Snooping scanning attack");
                        add("Malformed packet attack");
                        add("Special message attack");
                    }
                },
                ChapterName.CommonInformationSecurityThreats.number
        ));
        singleChoices.add(new SingleChoice(
                "Evidence identification needs to resolve the integrity verification of the evidence and determine whether it meets the applicable standards. Which of the following statements is correct about the standard of evidence identification?",
                "Relevance criterion means that if the electronic evidence can have a substantial impact on the facts of the case to s certain extent, the court should determine that it is relevant.",
                new LinkedList<String>(){
                    {
                        add("Objective standard means that the acquisition, storage, and submission of electronic evidence should be legal, and the basic rights such as national interests, social welfare, and personal privacy are not strictly violated.");
                        add("Legality standard is to ensure that the electronic evidence is collected from the initial collection, and there is no change in the content of the evidence submitted as evidence.");
                        add("Fairness standard refers to the evidence obtained by the legal subject through egal means, which has the evidence ability.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Regarding SSL VPN technology, which of the following options is wrong?",
                "SSL VPN requires a dial-up client.",
                new LinkedList<String>(){
                    {
                        add("SSL VPN technology can be perfectly applied to NAT traversal scenarios.");
                        add("SSL VPN technology encryption only takes effect on the application layer.");
                        add("SSL VPN technology extends the network scope of the enterprise.");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        singleChoices.add(new SingleChoice(
                "Data analysis technology is to find and -natch keywords or key ohrases in the acquired data stream or information flow, and analyze: he correlation of time. Which of the following is not an evidence analysis technique?",
                "Spam tracking technology.",
                new LinkedList<String>(){
                    {
                        add("Password deciphering, data decryption technology.");
                        add("Document Digital Abstract Analysis Technology.");
                        add("Techniques for discovering the connections between different evidences.");
                    }
                },
                0
        ));


        singleChoices.add(new SingleChoice(
                "When configuring NAT Server on the LSG series firewall, the server-map table will be generated. Which of the following does not belong in the table?",
                "Source IP .",
                new LinkedList<String>(){
                    {
                        add("Destination IP.");
                        add("Destination port.");
                        add("Agreement number.");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following attacks does not belong to special packet attack?",
                "IP address scanning attack.",
                new LinkedList<String>(){
                    {
                        add("ICMP redirect packet attack.");
                        add("ICMP unreachable packet attack.");
                        add("Large ICMP packet attack.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following attacks is not a malformed message attack?",
                "ICMP unreachable packet attack.",
                new LinkedList<String>(){
                    {
                        add("Teardrop attack.");
                        add("Smurf attack.");
                        add("TCP fragment attack.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "When the firewall hard disk is in place, which of the following is correct description for the firewall log?",
                "The administrator can learn the security policy of the traffic hit through the policy hit log. And use it for fault location when the problem occurs.",
                new LinkedList<String>(){
                    {
                        add("The administrator can advertise the content log to view the detection and defense records of network threats.");
                        add("The administrator can use the threat log to understand the user's security risk behavior and the reason for being alarmed or blocked.");
                        add("The administrator knows the user's behavior, the keywords explored, and the effectiveness of the audit policy configuration through the user activity log");
                    }
                },
                ChapterName.DataMonitoringandAnalysis.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is true about the description of SSL VPN?",
                "Can be used without a client.",
                new LinkedList<String>(){
                    {
                        add("May encrypt to IP layer.");
                        add("There is a NAT traversal problem.");
                        add("No authentication required.");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        singleChoices.add(new SingleChoice(
                "Some applications, such as Oracle database application, there is no data transfer for a long time, so that firewall session connection is interrupted, thus resulting in service interruption, which of the following technology can solve this problem?",
                "Configure a long business connection.",
                new LinkedList<String>(){
                    {
                        add("Configure default session aging time.");
                        add("Optimization of packet filtering rules.");
                        add("Turn fragment cache.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));
        singleChoices.add(new SingleChoice(
                "What is the nature cf information security in \"Implementation of security monitoring and management of information and information systems to prevent the illegal use of information and information systems\"?",
                "Controllability",
                new LinkedList<String>(){
                    {
                        add("Confidentiality");
                        add("Non-repudiation");
                        add("Integrity");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following options is not the part of the quantable?",
                "Source MAC.",
                new LinkedList<String>(){
                    {
                        add("Source IP.");
                        add("Destination IP.");
                        add("Destination Port.");
                    }
                },
                ChapterName.BasicNetworkConcepts.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following statement about the L2TP VPN of Client-initialized is wrong?",
                "remote users do not need to install VPN client software.",
                new LinkedList<String>(){
                    {
                        add("After the remote user access to internet, can initiate L2TP tunneling request to the remote LNS directly through the client software.");
                        add("LNS assign a private IP address for remote users.");
                        add("LNS device receives user L2TPconnection request, can verify based on user name and password.");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        singleChoices.add(new SingleChoice(
                " Regarding the description of the vulnerability scanning, which of the following is wrong?",
                "Vulnerability scanning is a passive preventive measure that can effectively avoid hacker attacks. ",
                new LinkedList<String>(){
                    {
                        add("Vulnerability scanning is a technology based on network remote monitoring of target network or host security performance vulnerability, which can be used for simulated attack experiments and security audits.");
                        add("Vulnerability scanning is used to detect whether there is a vulnerability in the target host system. Generally, the target host is scanned for specific vulnerabilities.");
                        add("Vulnerability scanning can be done based on the results of ping scan results and port scan.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Regarding the firewall security policy, which of the following options is wrong?",
                "If the security policy is permit, the discarded message will not accumulate the number of hits. ",
                new LinkedList<String>(){
                    {
                        add("When configuring the security policy name, you cannot reuse the same name.");
                        add("Adjust the order of security policies with immediate effect, no need to save the configuration file.");
                        add("H D. Huawei’s USG series firewalls cannot have more than 128 security policy entries.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is the correct description of the investigation and evidence collection?",
                "In the process of all investigation and evidence collection, there are law enforcement agencies involved.",
                new LinkedList<String>(){
                    {
                        add("Evidence is not necessarily required during the investigation.");
                        add("Evidence obtained by eavesdropping is also valid.");
                        add("Document evidence is required in computer crime.");
                    }
                },
                ChapterName.IntroductiontoSecurityOperations.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is wrong about the management of Internet users?",
                "Each user group can belong to multiple user groups.",
                new LinkedList<String>(){
                    {
                        add("Each user group can include multiple users and user groups.");
                        add("The system has a default user group by default, which is also the system default authentication domain.");
                        add("Each user belongs to at least one user group, also can belong to multiple user groups.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is not part of the method used in the Detection section of the P2DR model? ",
                "Alarm.",
                new LinkedList<String>(){
                    {
                        add("Real-time monitoring.");
                        add("Testing.");
                        add("Shut down the service");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is not part of the LINUX operating system?",
                "MAC OS.",
                new LinkedList<String>(){
                    {
                        add("CentOS.");
                        add("RedHat.");
                        add("Ubuntu.");
                    }
                },
                ChapterName.OperatingSystemOverview.number
        ));
        singleChoices.add(new SingleChoice(
                "In some scenarios, it is necessary to convert the source IP address and the destination IP address. Which of the following techniques is used in the scenario?",
                "Two-way NAT.",
                new LinkedList<String>(){
                    {
                        add("Source NAT.");
                        add("NAT-Server.");
                        add("NAT ALG.");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));
        singleChoices.add(new SingleChoice(
                "On the USG series firewall, after the web redirection function is configured, the authentication page cannot be displayed. Which of the following is not the cause of the fault?",
                "The port of service of authentication page is set to 8887.",
                new LinkedList<String>(){
                    {
                        add("The authentication policy is not configured or the authentication policy is incorrectly configured .");
                        add("Web authentication is not enabled.");
                        add("The browser SSL version does not match the SSL version of the firewall authentication page.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));
        singleChoices.add(new SingleChoice(
                "Which ofthe following options is the correct sequence of the four phases of the Information Security Management System (ISMS)?",
                "Plan->Do->Check->Action",
                new LinkedList<String>(){
                    {
                        add("Plan->Check->Do->Action");
                        add("Check->Plan->Do->Action");
                        add("Plan->Check->Action->Do");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "In the information security system construction management cycle, which of the following actions is required to be implemented in the \"check' link?",
                "Risk assessment",
                new LinkedList<String>(){
                    {
                        add("Safety management system design.");
                        add("Implementation of the safety management system.");
                        add("Safety management system operation monitoring.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Check the firewall HRP status information as follows:\n" +
                        "HRP_S [USG_ B] display hrp state 16:90: 13 2010/11/29 The firewall's config state is : SLAVE\n" +
                        "Current state of virtual routers configured as slave GigabitEthernet0/0/0 vird 1 : slave\n" +
                        "GigabitEthernet0/0/1 vied 2 : slave Which of the following description is correct?",
                "The firewall G0/0/0 and 0/1 GO / interface of VRRP group status is Slave",
                new LinkedList<String>(){
                    {
                        add("The firewall VGMP group status is Master.");
                        add("The firewall of HRP heartbeats interface is G0/0/0 and G0/0/1 .");
                        add("The firewall must be in a state of preemption.");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));
        singleChoices.add(new SingleChoice(
                "According to the protection object, the firewall is divided. Windows Firewall belongs to ",
                "Stand-alone firewall.",
                new LinkedList<String>(){
                    {
                        add("Software firewall.");
                        add("Hardware firewall.");
                        add("Network firewall.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                " The Huawei Redundancy Protocol (HRP) is used to synchronize the main firewall configuration and connection status and other data on the backup firewall to synchronize. Which of the following options is not in the scope of synchronization?",
                "IPS signature set.",
                new LinkedList<String>(){
                    {
                        add("Security policy.");
                        add("NAT policy.");
                        add("Blacklist.");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following descriptions is wrong about the root CA certificate?",
                "Signature is generated by CA public key encryption.",
                new LinkedList<String>(){
                    {
                        add("The issuer is CA.");
                        add("The certificate subject name is CA.");
                        add("Public key information is the public key ofthe CA.");
                    }
                },
                ChapterName.PKICertificateSystem.number
        ));
        singleChoices.add(new SingleChoice(
                "Which configuration is correct to implement NAT ALG function?",
                "detect protocol.",
                new LinkedList<String>(){
                    {
                        add("nat alg protocol.");
                        add("alg protocol.");
                        add("nat protocol.");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following statements is wrong about the firewall gateway's anti-virus response to the HTTP protocol?",
                "Response methods include announcement and blocking.",
                new LinkedList<String>(){
                    {
                        add("When the gateway device blocks the HTTP connection, push the web page to the client and generate a log.");
                        add("Alarm mode device only generates logs and sends them out without processing the files transmitted by the HTTP protocol.");
                        add("Blocking means that the device disconnects from the HTTP server and blocks file transfer.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                " Both the GE1/0/1 and GE1/0/2 ports of the firewall belong to the DMZ. If the area connected to GE1/0/1 can access the area connected to GE1/0/2, which of the following is correct?",
                "No need to do any configuration.",
                new LinkedList<String>(){
                    {
                        add("Need to configure the security policy from Local to DMZ.");
                        add("Need to configure an interzone security policy.");
                        add("Need to configure security policy from DMZ to local.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));

        singleChoices.add(new SingleChoice(
                "Which ofthe following does not belong to the user authentication method in the USG firewall?",
                "Fingerprint authentication.",
                new LinkedList<String>(){
                    {
                        add("Free certification.");
                        add("Password authentication.");
                        add("Single sign-on.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));

        singleChoices.add(new SingleChoice(
                " For the process of forwarding the first packet of the session between firewall domains, there\n" +
                        "are the following steps:\n" +
                        "1. find the routing table\n" +
                        "2. find inter-domain packet filtering rules\n" +
                        "3. find the session table\n" +
                        "4. find the blacklist\n" +
                        "Which of the following is the correct order?",
                "3->4->1->2",
                new LinkedList<String>(){
                    {
                        add("1->3->2->4");
                        add("3->2->1->4");
                        add("4->3->1->2");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));
        singleChoices.add(new SingleChoice(
                "The administrator wants to know the current session table. Which of the following commands is correct?",
                "Reset firewall session table.",
                new LinkedList<String>(){
                    {
                        add("Clear firewall session table.");
                        add("Display firewall session table.");
                        add("Display session table.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));
        singleChoices.add(new SingleChoice(
                " Use ip tables to write a rule that does not allow the network segment of 172.16.0.0/16 to access the devise. Which of the following rules is correct?",
                "Iptables -t filter -A INPUT -s 172.16.0.0/16 -p all -j DROP.",
                new LinkedList<String>(){
                    {
                        add("Iptables -t filter -P INPUT -s 172.16.0.0/16 -p all -j DROP.");
                        add("Iptables -t filter -P INPUT -s 172.1G.0.0/1G -p all -j ACCEPT.");
                        add("iptables -t filter -P INPUT -d 172.16.0.0/16 -p all -j ACCEPT.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                " About the contents of HRP standby configuration consistency check, which of the following is not included?",
                "Next hop and outbound interface of static route.",
                new LinkedList<String>(){
                    {
                        add("NAT policy.");
                        add("If the heartbeat interface with the same serial number configured.");
                        add("Certification strategy.");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));
        singleChoices.add(new SingleChoice(
                " In the USG series firewall, you can use the______function to provide well-known application services for non-known ports.",
                "Port mapping.",
                new LinkedList<String>(){
                    {
                        add("MAC and IP address binding.");
                        add("Packet filtering.");
                        add("Long connection.");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is not included in the design principles of the questionnaire? ",
                "Consistency.",
                new LinkedList<String>(){
                    {
                        add("Integrity.");
                        add("Openness.");
                        add("Specificity.");
                    }
                },
                ChapterName.DataMonitoringandAnalysis.number
        ));
        singleChoices.add(new SingleChoice(
                " The configuration commands for the NAT address pool are as follows: nat address-group 1\n" +
                        "section 0 202.202.168.10 202.202.168.20 mode no-pat Of which, the meaning of no-pat\n" +
                        "parameters is:",
                "Do not convert the source port.",
                new LinkedList<String>(){
                    {
                        add("Do not do address translation.");
                        add("Perform port multiplexing.");
                        add("Do not convert the destination port.");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following behaviors is relatively safer when connecting to Wi-Fi in public places?",
                "Connect to the paid Wi-Fi hotspot provided by the operator and only browse the web",
                new LinkedList<String>(){
                    {
                        add("Connect Wi-Fi hotspots that are not encrypted.");
                        add("Connect unencrypted free Wi-Fi for online shopping.");
                        add("Connect encrypted free Wi-Fi for online transfer operations.");
                    }
                },
                0
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following is the GRE protocol number?",
                "47",
                new LinkedList<String>(){
                    {
                        add("46");
                        add("89");
                        add("50");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following description about the VGMP protocol is wrong?",
                "State of VGMP group is active, which will periodically send HELLO packets to the opposite end. Stdandby end only monitors the HELLO packets, which will not respond.",
                new LinkedList<String>(){
                    {
                        add("VGMP add multiple VRRP backup groups on the same firewall to a management group, uniformly manage all the VRRP group by management group.");
                        add("VGMP ensure that all VRRP backup groups state are the same through a unified control of the switching of each VRRP backup group state.");
                        add("By default, when three HELLO packet cycle of Standby end does not receive HELLO packets which are sent from the opposite end, the opposite end will be considered a failure, which will switch itself to the Active state.");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));
        singleChoices.add(new SingleChoice(
                "Both A and B communicate data. If an asymmetric encryption algorithm is used for encryption, when A sends data to B. which of the following keys will be used for data encryption?",
                "public key.",
                new LinkedList<String>(){
                    {
                        add("A public key.");
                        add("A private key.");
                        add("B private key");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));
        //start mona
        singleChoices.add(new SingleChoice(
                "Based on the GRE encapsulation and de-encapsulation, which description is error?",
                "De-encapsulation Process: After the destination receives GRE packets, transmitting the data packets through looking up the routing to the Tunnel interfaces to trigger GRE encapsulation.",
                new LinkedList<String>(){
                    {
                        add("Encapsulation Process: The original data packets transmit the data packets through looking up routing to the Tunnel interface to trigger GRE encapsulation.");
                        add("Encapsulation Process: After GRE module packaging, the data packet will enter the IP module for further processing");
                        add("De-encapsulation Process: After GRE module de-encapsulation, the data packets will enter the IP module for further processing");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following is not a rating in the network security incident?",
                "Special network security incidents",
                new LinkedList<String>(){
                    {
                        add("Major network security incidents");
                        add("General network security incidents");
                    }
                },
                0
        ));

        singleChoices.add(new SingleChoice(
                "In Huawei SDSec solution, which layer of equipment does the firewall belong to?",
                "Executive layer",
                new LinkedList<String>(){
                    {
                        add("Analysis layer");
                        add("Control layer");
                        add("Monitoring layer");
                    }
                },
                0
        ));

        singleChoices.add(new SingleChoice(
                "When Firewall does dual-system hot backup networking, in order to achieve the overall status of the backup group switching, which of the following protocol technology need to be used?",
                "VGMP",
                new LinkedList<String>(){
                    {
                        add("VRRP");
                        add("HRP");
                        add("OSPF");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));

        singleChoices.add(new SingleChoice(
                "The scene of internal users access the internet as shown, the subscriber line processes are:\n" +
                        "1. After authentication, USG allow the connection\n" +
                        "2. The user input http://1.1.1.1 to access Internet\n" +
                        "3. USG push authentication interface. User =? Password =?\n" +
                        "4. The user successfully accessed http://1.1.1.1, equipment create Session table.\n" +
                        "5. User input User = Password = *** which the following procedure is correct?",
                "2-3-5-1-4",
                new LinkedList<String>(){
                    {
                        add("2-5-3-1-4");
                        add("2-1-3-5-4");
                        add("2-3-1-5-4");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));

        singleChoices.add(new SingleChoice(
                "Which ofjhe following is the encryption technology used in digital envelopes?",
                "Asymmetric encryption algorithm",
                new LinkedList<String>(){
                    {
                        add("Symmetric encryption algorithm");
                        add("Hash algorithm");
                        add("Streaming algorithm");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        singleChoices.add(new SingleChoice(
                "The attacker by sending ICMP response request, and will request packet destination address set to suffer Internet radio address. Which kind of attack does this behavior belong to9",
                "Smurf attack",
                new LinkedList<String>(){
                    {
                        add("IP spoofing attack");
                        add("ICMP redirect attack");
                        add("SYN flood attack");
                    }
                },
                0
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following is not part of a digital certificate?",
                "Private key",
                new LinkedList<String>(){
                    {
                        add("Public key");
                        add("Validity period");
                        add("Issuer");
                    }
                },
                ChapterName.PKICertificateSystem.number
        ));


        singleChoices.add(new SingleChoice(
                "Which of the following is not a key technology for anti-virus software?",
                "Format the disk",
                new LinkedList<String>(){
                    {
                        add("Shelling technology");
                        add("Self-protection");
                        add("Real-time upgrade ofthe virus database");
                    }
                },
                0
        ));


        singleChoices.add(new SingleChoice(
                "Which of the following is not the main form of computer crime?",
                "Using a computer for personal surveys",
                new LinkedList<String>(){
                    {
                        add("Implant a Trojan to the target host");
                        add("Hacking the target host");
                        add("Use scanning tools to collect network information without permission");
                    }
                },
                ChapterName.BasicConceptofInformationSecurity.number
        ));


        singleChoices.add(new SingleChoice(
                "When the IPSec VPN tunnel mode is deployed, the AH protocol is used for packet encapsulation. In the new IP packet header field, which of the following parameters does not require data integrity check?",
                "TTL",
                new LinkedList<String>(){
                    {
                        add("Source IP address");
                        add("Destination IP address");
                        add("Idetification");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));


        singleChoices.add(new SingleChoice(
                "When configuring a GRE tunnel interface, the destination address generally refers to which of the following parameters?",
                "Peer external network export IP address",
                new LinkedList<String>(){
                    {
                        add("Local tunnel interface IP address");
                        add("Local end network export IP address");
                        add("IP address of the peer tunnel interface");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));

        singleChoices.add(new SingleChoice(
                "In IPSEC VPN. Which of the following scenarios can be applied by tunnel mode?",
                "between security gateways",
                new LinkedList<String>(){
                    {
                        add("between the host and the host");
                        add("between hosts and security gateways");
                        add("Between tunnel mode and transport mode");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));
        singleChoices.add(new SingleChoice(
                "Which cf the following is correct about the description of SSL VPN?",
                "Can be used without a client",
                new LinkedList<String>(){
                    {
                        add("may IP encrypt layer");
                        add("There is a NAT traversal problem");
                        add("No authentication required");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));
        singleChoices.add(new SingleChoice(
                "Which description about disconnect the TCP connection 4 times-handshake is wrong?",
                "when passive close receipt the first FIN. it will send back an ACK, and randomly generated to confirm the serial number (",
                new LinkedList<String>(){
                    {
                        add("passive closing party end need to send a file to the application, the application will close it connection and lead to send a FIN");
                        add("in passive close the sender after the FIN. initiative to close must send back a confirmation, and will confirm the serial number is set to receive serial number 1");
                        add("initiative to shut down the sender first FIN active closed, while the other received this FIN perform passive shut down");
                    }

                },
                ChapterName.BasicNetworkConcepts.number

        ));

        singleChoices.add(new SingleChoice(
                "Regarding the firewall security policy, which of the following options are wrong?",
                "If the security policy is permit, the discarded message will not accumulate the number of hits.",
                new LinkedList<String>(){
                    {
                        add("When configuring the security policy name, you cannot reuse the same name");
                        add("Adjust the order of security policies without saving the configuration file.");
                        add("The number of security policy entries of Huawei USG series firewalls cannot exceed 128.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));

        singleChoices.add(new SingleChoice(
                "Which ofthe following is the username / password for the first login ofthe USG series firewall?",
                "Username admin, password Admin@123",
                new LinkedList<String>(){
                    {
                        add("User name admin, password admin@123");
                        add("User name admin, password admin");
                        add("User name admin, password Admin123");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number

        ));

        singleChoices.add(new SingleChoice(
                "There ere various security threats in the use of the server. Which of the following options is not a server security threat?",
                "Natural disasters",
                new LinkedList<String>(){
                    {
                        add("DDos attack");
                        add("Hacking");
                        add("Malicious programs");
                    }
                },
                ChapterName.CommonInformationSecurityThreats.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following statement about the L2TP VPN of Clieit-initialized is wrong?",
                "remote users do not need to install VPN client software",
                new LinkedList<String>(){
                    {
                        add("After the remote user access to internet, can initiate L2TP tunneling request to the remote LNS directly through the client software");
                        add("LNS device receives user L2TPconnection request, can verify based on user name and password.");
                        add("LNS assign a private IP address for remote users");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        singleChoices.add(new SingleChoice(
                "Which of the following options does not include the respondents in the questionnaire for safety assessment?",
                "HR",
                new LinkedList<String>(){
                    {
                        add("Network System Administrator");
                        add("Security administrator");
                        add("Technical leader");
                    }
                },
                0
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following statement about :he NAT is wrong?",
                "For some non-TCP. UDP protocols (such as ICMP. PPTP), unable to do the NAT translation",
                new LinkedList<String>(){
                    {
                        add("NAT technology can effectively hide the hosts of the LAN. it is an effective network security protection technology");
                        add("Address Translation can follow the needs of users, providing FTP. WWW, Telnet and other services outside the LAN");
                        add("Some application layer protocols earn/ IP address information in the data, but also modify the P address information in the data of the upper layer when they are as NAT");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following is not included in the Corporate Impact Analysis (BIA)?",
                "Impact assessment",
                new LinkedList<String>(){
                    {
                        add("Risk identification");
                        add("Business priority");
                        add("Accident handling priority");
                    }
                },
                0
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following statements is wrong about VPN?",
                "VPN technology necessarily involves encryption technology",
                new LinkedList<String>(){
                    {
                        add("VPN technology is a technology that multiplexes logica channels on actual physical lines.");
                        add("The generation of VPN technology enables employees on business trips to remotely access internal corporate servers.");
                        add("Virtual private network is cheaper than dedicated line");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));

        singleChoices.add(new SingleChoice(
                "Which of the following descriptions is wrong about IKE SA?",
                "The encryption algorithm used by user data packets is determined by IKE SA.",
                new LinkedList<String>(){
                    {
                        add("IKE SA is two-way");
                        add("IKE is a UDP- based application layer protocol");
                        add("IKE SA for IPSec SA services");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));

        singleChoices.add(new SingleChoice(
                "The GE1/0/1 and GE1/0/2 ports of the firewall belong to the DMZ. If the area connected to GE1/0/1 can access the area connected to GE1/0/2, which of the following is correct?",
                "No need to do any configuration (",
                new LinkedList<String>(){
                    {
                        add("Need to configure an interzone security policy");
                        add("Need to configure DMZ to local security policy");
                        add("Need to configure local to DMZ security policy");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number

        ));

        singleChoices.add(new SingleChoice(
                "Which of the following traffic matches the authentication policy triggers authentication?",
                "Traffic of visitors accessing HTTP services",
                new LinkedList<String>(){
                    {
                        add("Access device or device initiated traffic");
                        add("The first DNS packet corresponding to the HTTP service data flow");
                        add("DHCP, BGP. OSPF and LDP packets");
                    }
                },
                0
        ));

        singleChoices.add(new SingleChoice(
                "In the digital signature process, which of the following is the HASH algorithm to verify the integrity of the data transmission?",
                "User data",
                new LinkedList<String>(){
                    {
                        add("Symmetric key");
                        add("Receiver public key");
                        add("Receiver private key");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        singleChoices.add(new SingleChoice(
                "On Huawei USG series devices, the administrator wants to erase the configuration file. Which of the following commands is correct?",
                "reset saved-configuration",
                new LinkedList<String>(){
                    {
                        add("clear saved-configuration");
                        add("reset current-configuration");
                        add("reset running-configuration");
                    }
                },
                ChapterName.CommonNetworkDevices.number
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following io true about the description of the firewall?",
                "Depending on the usage scenario, the firewall can be deployed in transparent moce or deployed in a three bedroom mode.",
                new LinkedList<String>(){
                    {
                        add("The firewall cannot transparently access the network.");
                        add("Adding a firewall to the network will inevitably change the :opology of the network.");
                        add("In order to avoid single point of faiure. the firewall only supports side-by-side deplcyment");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));

        singleChoices.add(new SingleChoice(
                "Which of the following is true about firewall security policies?",
                "By default, the security policy only controls unicast packets",
                new LinkedList<String>(){
                    {
                        add("By default, the security policy can control unicast packets and broadcast packets.");
                        add("By default, the security policy can control multicast.");
                        add("By default, the security policy can control unicast packets, broadcast packets, and multicast packets");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));

        singleChoices.add(new SingleChoice(
                "When the following conditions occur in the VGMP group, the VGMP message will not be sent to the peer end actively?",
                "Session table entry changes",
                new LinkedList<String>(){
                    {
                        add("Dual hot backup function enabled");
                        add("Manually switch the active and standby status of the firewall.");
                        add("Firewall service interface failure");
                    }
                },
                ChapterName.DualSystemHotStandby.number

        ));
        singleChoices.add(new SingleChoice(
                "Electronic evidence preservation is directly related to the legal effect of evidence, in line with the preservation of legal procedures, and its authenticity and reliability are guaranteed. Which of the following is not an evidence preservation technology?",
                "Message tag tracking technology",
                new LinkedList<String>(){
                    {
                        add("Encryption technology");
                        add("Digital certificate technology");
                        add("Digital signature technology");
                    }
                },
                0
        ));


        singleChoices.add(new SingleChoice(
                "Regarding the comparison between windows and Linux, which of the following statements\n" +
                        "is wrong?",
                "windows is open source, you can do what you want.",
                new LinkedList<String>(){
                    {
                        add("Linux is open source code, you can do what you want.");
                        add("Windows can be compatible with most software playing most games");
                        add("Getting started with Linux is more difficult and requires some learning and guidance.");
                    }
                },
                ChapterName.OperatingSystemOverview.number
        ));


        singleChoices.add(new SingleChoice(
                "Which of the following option does not belong to symmetric encryption algorithm?",
                "RSA",
                new LinkedList<String>(){
                    {
                        add("DES");
                        add("3DES");
                        add("AES");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));
    }

    private static void multipleChoiceFillers(){
        multipleChoices=new ArrayList<MultipleChoice>();
        multipleChoices.add(new MultipleChoice(
                "Which of the following information will be encrypted during the use of digital envelopes?",
                new LinkedList<String>(){
                    {
                        add("Symmetric key");
                        add("User data");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Receiver public key");
                        add("Receiver private key");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following is an action to be taken during the eradication phase of the cyber security emergency response?",
                new LinkedList<String>(){
                    {
                        add("Find sick Trojans, illegal authorization, system vulnerabilities, and deal with it in time");
                        add("Revise the security policy based on the security incident that occurred, enable security auditing");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Block the behavior ofthe attack, reduce the scope of influence");
                        add("Confirm the damage caused by security incidents and report security incidents");
                    }
                },
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following attacks can DHCP Snooping prevent?",
                new LinkedList<String>(){
                    {
                        add("DHCP Server counterfeiter attack");
                        add("Intermediaries and IP/MAC spoofing attacks");
                        add("IP spoofing attack");
                        add("Counterfeit DHCP lease renewal packet attack using option82 field");
                    }
                },
                new LinkedList<String>(),
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following belongs to the devices at the execution layer in the Huawei SDSec solution?",
                new LinkedList<String>(){
                    {
                        add("Fierhunter");
                        add("Router");
                        add("AntiDDoS");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("cis");
                    }
                },
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "A company employee account authority expires, but can still use the account to access the company server. What are the security risks of the above scenarios?",
                new LinkedList<String>(){
                    {
                        add("Managing security risk");
                        add("Access security risk");
                        add("System security risk");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Physical security risk");
                    }
                },
                ChapterName.BasicConceptofInformationSecurity.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are the necessary configurations of IPSec VPN?",
                new LinkedList<String>(){
                    {
                        add("Configuring IKE neighbors");
                        add("Configure IKE SA related parameters");
                        add("Configuring IPSec SA related parameters");
                        add("Configure the stream of interest");

                    }
                },
                new LinkedList<String>(),
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which ofthe following types are included in Huawei firewall user management?",
                new LinkedList<String>(){
                    {
                        add("Internet user management");
                        add("H B. Access user management");
                        add("Administrator User Management");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Device User Management");
                    }
                },
                ChapterName.FireWallUserManagement.number
        ));
        multipleChoices.add(new MultipleChoice(
                "In order to obtain evidence of crime, it is necessary to master :he technology of intrusion tracking. Which of the following descriptions are correct about the tracking technology?",
                new LinkedList<String>(){
                    {
                        add("Packet Recording Technology marks packets on each router that has been spoken by inserting trace data into the tracked IP packets");
                        add("Link detection technology determines the source of the attack by testing the network connection between the routers");
                        add("Analysis of shallow mail behavior can analyze the information such as sending IP address, sending time, sending frequency, number of recipients, shallow email headers, etc.");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Packet tagging technology extracts information from attack sources by recording packets on the router and then using data drilling techniques");
                    }
                },
                ChapterName.OverviewofIntrusionPrevention.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following options belong to the encapsulation mode supported by IPSec VPN?",
                new LinkedList<String>(){
                    {
                        add("Tunnel Mode");
                        add("Transmission mode");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("AH mode");
                        add("ESP mode");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following options are correct about the NAT policy processing flow?",
                new LinkedList<String>(){
                    {
                        add("Server-map is processed after status detection");
                        add("The source NAT policy is processed after the security policy is matched");
                        add("Server-map is processed before the security policy matches");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Source NAT policy query is processed after the session is created");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following options belong to the necessary configuration for the firewall double hot standby scenario?",
                new LinkedList<String>(){
                    {
                        add("hrp enable");
                        add("hrp interface interface-type interface-number");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("hrp mirror session enable");
                        add("hrp preempt");
                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are the default security zones of Huawei firewall?",
                new LinkedList<String>(){
                    {
                        add("Trust area");
                        add("Untrust area");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Zone area");
                        add("Security area");
                    }
                },
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "According to the management specifications, the network security system and equipment are regularly checked, the patches are upgraded, and the network security emergency response drill is organized. Which of the following belongs to the MPDRR network security modes of the above actions?",
                new LinkedList<String>(){
                    {
                        add("Testing link");
                        add("Response link");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Protection link");
                        add("Management link");
                    }
                },
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following statements are correct about the differences between pre-accident prevention strategies and post-accident recovery strategies?",
                new LinkedList<String>(){
                    {
                        add("The prevention strategy focuses or minimizing the likelihood of an accident before the story occurs. The recovery strategy focuses on minimizing the impact and loss on the company after the accident");
                        add("Recovery strategy is used to imprcve business high availability");
                        add("Recovery strategy is part of the business continuity plan");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("The role of pre-disaster prevention strategies does not include minimizing economic, reputational, and other losses caused by accidents");
                    }
                },
                ChapterName.IntroductiontoSecurityOperations.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following operations are necessary during the administrator upgrade of the USG firewall software version?",
                new LinkedList<String>(){
                    {
                        add("Upload the firewall version software");
                        add("Restart the device");
                        add("Specify the next time you start loading the software version");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Device factory reset");
                    }
                },
                ChapterName.CommonNetworkDevices.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following statements are correct about the business continuity plan?",
                new LinkedList<String>(){
                    {
                        add("BCP needs flexibility because it cannot predict all possible accidents");
                        add("Not all security incidents must be reported to company executives");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Business continuity plan does not require high-level participation of the company before forming a formal document");
                    }
                },
                ChapterName.IntroductiontoSecurityOperations.number
        ));
        multipleChoices.add(new MultipleChoice(
                "When the USG series firewall hard disk is replaced, which of the following logs can be viewed?",
                new LinkedList<String>(){
                    {
                        add("Operation log");
                        add("Business log");
                        add("Alarm information");
                        add("Threat log");
                    }
                },
                new LinkedList<String>(),
                ChapterName.DataMonitoringandAnalysis.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following statements are correct about Huawei routers and switches?",
                new LinkedList<String>(){
                    {
                        add("The router can implement some security functions, and some routers can implement more security functions by adding security boards");
                        add("The switch has some security features, and some switches can implement more security functions by adding security boards");
                        add("The main function of the router is to forward data. Sometimes the firewall may be a more suitable choice when the enterprise has security requirements");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("The switch does not have security features");

                    }
                },
                ChapterName.CommonNetworkDevices.number
        ));
        multipleChoices.add(new MultipleChoice(
                "After the network intrusion event occurs, according to the plan to obtain the identity of the intrusion, the attack source and other information, and block the intrusion behavior, which links of the above actions are involved in the PDRR network security model?",
                new LinkedList<String>(){
                    {
                        add("Testing link");
                        add("Response link");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Protection link");
                        add("Recovery link");
                    }
                },
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following description are correct about the security policy action and security configuration file?",
                new LinkedList<String>(){
                    {
                        add("If the action of the security policy is 'prohibited’, the device will discard this traffic and will not perform content security check later");
                        add("The security configuration file must be applied to the security policy that is allowed to take effect");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("If the security policy action is \"Allow\", the traffic will not match the security configuration file");
                        add("The security configuration file can be applied without being applied to the security policy allowed by the action");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are the same features of Windows and LINUX systems?",
                new LinkedList<String>(){
                    {
                        add("Support multitasking and Support graphical interface operations ");
                        add("Support multiple terminal platforms");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Open source system");
                    }
                },
                ChapterName.OperatingSystemOverview.number
        ));
        multipleChoices.add(new MultipleChoice(
                "During the configuration of NAT. which of the following will the device generate a Server-map entry?",
                new LinkedList<String>(){
                    {
                        add("After the NAT server is configured successfully, the device automatically generates a server map entry");
                        add("After configuring NAT No-PAT, the device will create a server-map table for the configured multi-channel protocol data stream.");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Automatically generate server-map entries when configuring source NAT.");
                        add("A server-map entry is generated when easy-ip is configured.");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));
        multipleChoices.add(new MultipleChoice(
                "ASPF (Application Specific Packet Filter) is a packet filtering technology based on the application layer, and implements a special security mechanism through the server-map table. Which of the following statements about the ASPF and server-map tables are correct?",
                new LinkedList<String>(){
                    {
                        add("ASPF monitors messages during communication");
                        add("ASPF can dynamically create a server-map");
                        add("ASPF dynamically allows multi-channel protocol data to pass through the server-map table");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("The quintuple server-map entry implements a similar function to the session table");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));
        multipleChoices.add(new MultipleChoice(
                    "Execute the command on the firewall and display the following information, which of the following description is correct? (Multiple Choice)\n" +
                            "HRP_A [USG_A] display vrrp interfaceGigabitEthernet 0/0/1 \\ GigabitEthernet9/0/1 | Virtual Router 1VRRP Group: Active state: Active Virtual IP: 202.38.10.1 Virtual MAC: 0000-5e00-0101 Primary IP: 202 38.10.2 PriorityRun: 100 PriorityConfig: 100 MasterPriority: 100 Preempt: YES Delay Time: 10",
                new LinkedList<String>(){
                    {
                        add("The status of this firewall VGMP group is Active");
                        add("This firewall VRID is 1 the VRRP priority to backup g'oup 100");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("This firewall G1 / 0/1 virtual interface IP address 202.30.10.2");
                        add("Will not switch when the primary device fails");                    }
                },
                ChapterName.DualSystemHotStandby.number
        ));
        multipleChoices.add(new MultipleChoice(
                "What is the difference between network address port translation (NAT) and conversion-only network address (No- PAT)?",
                new LinkedList<String>(){
                    {
                        add("After NATP conversion, for external network users, all messages are from the same IP address or several IP addresses.");
                        add("No-PAT supports protocol address translation at the network layer");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("No-PAT only supports protocol address translation at the application layer.");
                        add("NAPT only supports protocol address translation at the network layer");                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following descriptions are correct about the buffer overflow attack?",
                new LinkedList<String>(){
                    {
                        add("Buffer overflow attack is the use of software system for memory operation defects, running attack code with high operation authority");
                        add("Buffer overflow attacks are the most common method of attacking software systems");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Buffer overflow attacks are not related to operating system vulnerabilities and architectures");
                        add("Buffer overflow attack belongs to application layer attack behavior");                    }
                },
                    0
            ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are international organizations related to information security standardization?",
                new LinkedList<String>(){
                    {
                        add("International Organization for Standardization(ISO)");
                        add("International Electrotechnical Commission(IEC)");
                        add("International Telecommunication Union (ITU)");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Wi-Fi Alliance");
                    }
                    },
                ChapterName.InformationSecurityStandardsandSpecifications.number
        ));
        multipleChoices.add(new MultipleChoice(
                "In o der to obtain evidence of crime, it is necessary to master the technology of intrusion tracking Which of the following descriptions are correct about the tracking technology?",
                new LinkedList<String>(){
                    {
                        add("Packet Recording Technology marks packets on each passing router by inserting trace data into the tracked IP packets");
                        add("Link test technology determines the source of the attack by testing the network link between the routers");
                        add("Snallow mail behavior analysis can analyze the information such as sending IF address, sending time, sending frequency, number of recipients, shallow email heacers and so on");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Packet tagging technology extracts information from attack sources by recording packets on the router and then using data drilling techniques");
                    }
                },
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "In the classification of the information security level protection system, which of the following levels defines the damage to the social order and the public interest if the information system is destroyed?",
                new LinkedList<String>(){
                    {
                        add("First level User-independent protection level (");
                        add("Second level System audit protection level");
                        add("Third level Security mark protection");
                        add("Fourth level Structured protection");
                    }
                },
                new LinkedList<String>(){
                    {
                                 }
                },
                0
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following options are correct about the control actions permit and deny of the firewall interzone forwarding security policy?",
                new LinkedList<String>(){
                    {
                        add("The action of the firewall default security policy is deny");
                        add("The packet is matched immediately after the inter-domain security policy deny action, and the other interzone security policy will not be executed.");
                    add("Even if the packet matches the permit action of the security policy, it will not necessarily be forwarded by the firewall");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Whether the message matches the permit action of the security policy or the deny action, the message will be processed by the UTM module.");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));

        //eman start

        multipleChoices.add(new MultipleChoice(
                "Which of the following are the characteristics of a symmetric encryption algorithm? ",
                new LinkedList<String>(){
                    {
                        add("Fast encryption ");
                        add("Key distribution is not secure");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Confidential speed is slow ");
                        add("Key distribution security is high ");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following are the hazards of traffic attacks? ",
                new LinkedList<String>(){
                    {
                        add("Network paralysis ");
                        add("Server downtime ");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Data is stolen ");
                        add("The page has been tampered with  ");
                    }
                },
                0

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following descriptions about the action and security profile of the security policy are correct?  ",
                new LinkedList<String>(){
                    {
                        add("If the action of the security policy is \"prohibited”, the device will discard this traffic, and then no content security check will be performed.  ");
                        add("The security profile must be applied to the security policy that s allowed to take effect. ");


                    }
                },
                new LinkedList<String>(){
                    {
                        add("The security profile may know: be applied to the security policy tfat the action is allowed and take effect. ");
                        add("If the security policy action is \"Allow\", the traffic will not match the security profile. ");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following does the encryption technology support for data during data transmission?   ",
                new LinkedList<String>(){
                    {
                        add("Confidentiality ");
                        add("Integrity  ");
                        add("Source verification ");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Controllability ");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following descriptions of the firewall fragment cache function are correct? ",
                new LinkedList<String>(){
                    {
                        add("By default, the firewall caches fragmented packets. ");
                        add("For fragmented packets, NAT ALG does not support the processing of SIP fragmen:ed packets ");
                        add("By default, the number of large fragment caches of an IPV4 packet is 32, and the number of large fragmentation buffers of an IPV6 packet is 255 ");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("After the fragmented packet is directly forwarded, the firewall forwards the fragment according to the interzone security policy if it is not the fragmented packet of the first packet.");

                    }
                },
                0

        ));



        multipleChoices.add(new MultipleChoice(
                "Which of the following 3re the versions of the SNMP protocol?",
                new LinkedList<String>(){
                    {
                        add("SNMPvl ");
                        add("SNMPv2c ");
                        add("SNMPv3 ");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("SNMPv2b ");

                    }
                },
                ChapterName.BasicNetworkConcepts.number

        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following are the status information that can be backed up by the HRP (Huawei Redundancy Protocol) protocol? ",
                new LinkedList<String>(){
                    {
                        add("Session table ");
                        add("ServerMap entry  ");
                        add("Dynamic blacklist ");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Routing table ");

                    }
                },
                ChapterName.DualSystemHotStandby.number

        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following are remote authentication methods?",
                new LinkedList<String>(){
                    {
                        add("RADIUS ");
                        add("HWTACACS");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Local ");
                        add("LLDP");
                    }
                },
                0

        ));


        multipleChoices.add(new MultipleChoice(
                "In L2TP configuration for command Tunnel Name, which statements are correct? ",
                new LinkedList<String>(){
                    {
                        add("Used to specify the name of the end of the tunnel ");
                        add("If do not configure the Tunnel Name, the tunnel name is the name of the local system ");


                    }
                },
                new LinkedList<String>(){
                    {
                        add("Used to specify the name of the peer tunnel ");
                        add("Must be consistent with Tunnel Name peer configuration ");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));


        multipleChoices.add(new MultipleChoice(
                "About the descriptions of windows Firewall Advanced Settings, which of the following is wrong? ",
                new LinkedList<String>(){
                    {
                        add("When setting the stacking rule, both the local port and the remote port can be restricted.");
                        add("When setting the pop-up rule, both local ports and remote ports can be restricted. ");


                    }
                },
                new LinkedList<String>(){
                    {
                        add("When setting the stacking rule, only the local port can be restricted, and the remote port cannot be restricted");
                        add("When setting the pop-up rule, only the local port can be restricted, and the remote port cannot be restricted");
                    }
                },
                0

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following are malicious programs?",
                new LinkedList<String>(){
                    {
                        add("Trojan horse ");
                        add("Worm");
                        add("Virus");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Vulnerabilities ");

                    }
                },
                ChapterName.CommonInformationSecurityThreats.number

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following are the response actions after the gateway antivirus detects the mail virus?",
                new LinkedList<String>(){
                    {
                        add(" Alarm ");
                        add("  Blocking ");
                        add(" Delete attachments ");
                        add("  Announcement");
                    }
                },
                new LinkedList<String>(){
                    {

                    }
                },
                0

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following are the main implementations of gateway anti-viru3? ",
                new LinkedList<String>(){
                    {
                        add("Agent scanning method ");
                        add("Stream scanning method ");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Package inspection method ");
                        add("File killing method ");
                    }
                },
                0

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following description of firewall hut standby is correct? ",
                new LinkedList<String>(){
                    {
                        add("When multiple areas of the firewall need to provide dual-system backup, you need to configure multiple VRRP backup groups on the firewall");
                        add("The status of all VRRP backup groups in the same VGMP management group on the same firewall is the same");
                        add("VCMP i3 to ensure the consistency of all VRRP backup group switching");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("The hot standby of the firewall needs to synchronize the backup between the master device and the slave device by using the session table. MAC table, and routing table");

                    }
                },
                ChapterName.DualSystemHotStandby.number

        ));


        multipleChoices.add(new MultipleChoice(
                ". Security technology has different methods at different technical levels and areas. Which of the following devices can be used for network layer security protection?  ",
                new LinkedList<String>(){
                    {
                        add(" Firewall ");
                        add(" Anti-DDoS device ");
                        add(" IPS/IDS device ");

                    }
                },
                new LinkedList<String>(){
                    {
                        add(" Vulnerability scanning device ");

                    }
                },
                ChapterName.CommonNetworkDevices.number

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following mechanisms are used in the MAC flooding attack? ",
                new LinkedList<String>(){
                    {
                        add(" MAC learning mechanism of the switch ");
                        add(" forwarding mechanism of the switch  ");
                        add("ARP learning mechanism ");
                        add(" Number of MAC entries is limited ");
                    }
                },
                new LinkedList<String>(){
                },
                0

        ));


        multipleChoices.add(new MultipleChoice(
                " Which of the following information will be encrypted during the use of digital envelopes?  ",
                new LinkedList<String>(){
                    {
                        add("Symmetric key");
                        add("User data ");


                    }
                },
                new LinkedList<String>(){
                    {
                        add("Receiver public key ");
                        add("Receiver private key ");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number

        ));


        multipleChoices.add(new MultipleChoice(
                "Which of the following is an action to be taken during the eradication phase of the cyber security emergency response? ",
                new LinkedList<String>(){
                    {
                        add("Find sick Trojans, illegal authorization, system vulnerabilities, and deal with it in time ");
                        add("Revise the security policy based on the security incident that occurred, enable security auditing");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Block the behavior ofthe attack, reduce the scope of influence ");
                        add("Confirm the damage caused by security incidents and report security incidents ");

                    }
                },
                ChapterName.CybersecurityEmergencyResponse.number

        ));
        //eman end
        //start manar

        multipleChoices.add(new MultipleChoice(
                "Which of the following is the correct description of windows log event type? ",
                new LinkedList<String>(){
                    {
                        add("Error events usually refer to the loss of function and data. For example, if a servicemc" +
                                "cannot be loaded as a system boot, an error event will be generated. ");
                        add("When the disk space is insufficient, it will be recorded as an \"information event\" ");
                        add("Failure audit event refers to a failed audit security login attempt, such as a failure when the user views accesses the network drive is logged as a failed audit event.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("A warning event is a successful operation event of an application, driver, or service.");
                    }
                },
                ChapterName.DataMonitoringandAnalysis.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which types of encryption technology can be divided into?",
                new LinkedList<String>(){
                    {
                        add("Symmetric encryption");
                        add("Asymmetric encryption");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Fingerprint encryption");
                        add("Data encryption");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number

        ));
        multipleChoices.add(new MultipleChoice(
                "HRP (Huawei Redundancy Protocol) Protocol to back up the connection state of data include?",
                new LinkedList<String>(){
                    {
                        add("TCP/UDP sessions table");
                        add("Server Map table");
                        add("the dynamic blacklist");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("the routing table");

                    }
                },
                ChapterName.DualSystemHotStandby.number

        ));
        multipleChoices.add(new MultipleChoice(
                "Ipsec which of the following is true",
                new LinkedList<String>(){
                    {
                        add("ESP can provide encryption and verification functions.");
                        add("The agreement number of AH is 51.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("AH can provide encryption and verification functions.");
                        add("The agreement number of ESP is 51.");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following options can be used in the advanced settings of windows firewall? ",
                new LinkedList<String>(){
                    {
                        add("Restore defaults.");
                        add("Change notification rules.");
                        add("Set connection security rules.");
                        add("Set out inbound rules.");
                    }
                },
                new LinkedList<String>(){
                    { }
                },
                ChapterName.IntroductiontoFirewalls.number

        ));
        multipleChoices.add(new MultipleChoice(
                "Typical remote authentication modes are: ",
                new LinkedList<String>(){
                    {
                        add("RADIUS.");
                        add("HWTACACS.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Local.");
                        add("LDP.");
                    }
                },
                0

        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following is the encryption technology used by digital envelopes?",
                new LinkedList<String>(){
                    {
                        add("Symmetric encryption algorithm.");
                        add("Asymmetric encryption algorithm.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Hash algorithm.");
                        add("Stream encryption algorithm.");
                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number

        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following protection levels are included in the TCSEC standard? ",
                new LinkedList<String>(){
                    {
                        add("Verify protection level.");
                        add("Forced protection level.");
                        add("Independent protection level.");
                    }
                },
                new LinkedList<String>(){
                    {

                        add("Passive protection level.");
                    }
                },
                0

        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are parts of the PKI architecture?",
                new LinkedList<String>(){
                    {
                        add("End entity.");
                        add("Certification Authority.");
                        add("Certificate Registration Authority.");
                        add("Certificate Storage organization");
                    }
                },
                new LinkedList<String>(){
                    { }
                },
                ChapterName.PKICertificateSystem.number


        ));
        multipleChoices.add(new MultipleChoice(
                "Regarding the description of Windows Firewall, which of the following options are correct? ",
                new LinkedList<String>(){
                    {
                        add("Windows Firewall not only allows or prohibits preset programs or functions and programs installed on the system, but also can customize the release rules according to the protocol or port number. ");
                        add("If you are unable to access the Internet during the process of setting up the Windows Firewall, you can use the Restore Defaults feature to quickly restore the firewall to its initial state.");
                        add("Windows Firewall can also change notification rules when it is off. ");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Windows Firewall can only allow or prohibit preset programs or functions and programs installed on the system, and cannot customize the release rules according to the protocol or port number.");

                    }
                },
                0

        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following protocols can guarantee the confidentiality of data transmission? ",
                new LinkedList<String>(){
                    {
                        add("SSH");
                        add("HTTPS");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Telnet");
                        add("FTP");
                    }
                },
                ChapterName.BasicNetworkConcepts.number

        ));
        multipleChoices.add(new MultipleChoice(
                "Classify servers based on the shape, what types of the following can be divided into? ",
                new LinkedList<String>(){
                    {
                        add("Blade senver");
                        add("Tower server");
                        add("Rack server");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("X86 server");
                    }
                },
                ChapterName.CommonServerTypesandThreats.number

        ));
        multipleChoices.add(new MultipleChoice(
                " Which of the following are the ways in which a PKI entity applies for a local certificate from CA?",
                new LinkedList<String>(){
                    {
                        add("Online application.");
                        add("Offline application.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Local application.");
                        add("Network application.");
                    }
                },
                ChapterName.PKICertificateSystem.number

        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are correct about configuring the firewall security zone?",
                new LinkedList<String>(){
                    {
                        add("The firewall has four security zones by default, and the four security zone priorities do not support modification. ");
                        add("When data flows between different security zones, the device security check is triggered and the corresponding security policy is implemented.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Firewall can have 12 security zones at most.");
                        add("The firewall can create two security zones of the same priority.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number

        ));
        multipleChoices.add(new MultipleChoice(
                " Which of the following are the basic functions of anti-virus software? ",
                new LinkedList<String>(){
                    {
                        add("Defend virus.");
                        add("Find virus.");
                        add("Clear virus.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Copy virus");
                    }
                },
                ChapterName.HostFirewallsandAntivirusSoftware.number

        ));
        multipleChoices.add(new MultipleChoice(
                "Terminal detection is an important part of the future development of information security. Which of the following methods belong to the category of terminal detection?",
                new LinkedList<String>(){
                    {
                        add("Install host antivirus software.");
                        add("Monitor the host registry modification record.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Monitor and remember the external device.");
                        add("Prevent users from accessing public network search engines.");
                    }
                },
                ChapterName.CybersecurityEmergencyResponse.number

        ));
        multipleChoices.add(new MultipleChoice(
                " Which of the following is an action to be t3ken during the summary phase of the cyber security emergency response?",
                new LinkedList<String>(){
                    {
                        add("Evaluate the implementation of the contingency plan and propose a follow-up improvement plan.");
                        add("Evaluation of members of the emergency response organization.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Establish a defense system and specify control measures.");
                        add("Determine the effectiveness nf the isnhtinn measures.");
                    }
                },
                ChapterName.CybersecurityEmergencyResponse.number

        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following descriptions is correct about port mirroring?",
                new LinkedList<String>(){
                    {
                        add("The mirrored port copies the packet to the observing port.");
                        add("The observing port sends the \"eceived packet to the monitoring device.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("The mirrored port sends the received packet to the monitoring device.");
                        add("The observing port copies the packet to the mirrored port.");
                    }
                },
                ChapterName.DataMonitoringandAnalysis.number

        ));
//start mona


        multipleChoices.add(new MultipleChoice(
                "In the current network it has deployed other authentication system, device registration function by enabling a single point, reducing the user to re-enter the password. What are correct about single sign-on statements?",
                new LinkedList<String>(){
                    {
                        add("Device can identify the user through the authentication of the identity authentication system, user access, the device will not pis authentication pages, to avoid further asked to enter a username / password");
                        add("AD domain single sign-on login can be minored data stream synchronized manner to the firewall");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("AD domain single sign-on is only one depbyment model");
                        add("Although not require to enter a user password, but the authentication server needs to interact with the user password and devices used to ensure that certification through discussion");
                    }
                },
                0

        ));
        multipleChoices.add(new MultipleChoice(
                "Regarding the relationship and role of VRRP/VGMP/HRP, which of the following statements are correct?",
                new LinkedList<String>(){
                    {
                        add("VRRP is responsible for sending free ARP to direct traffic to the new primary device during active/standby switchover");
                        add("VGMP is responsible for monitoring equipment failures and controlling fast switching of equipment.");
                        add("HRP is responsible for data backup during hot standby operation");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("VGMP group in the active state may include the VRRP group in the standby state.");
                    }
                },
                12

        ));

        multipleChoices.add(new MultipleChoice(
                "The administrator PC and the USG firewall management interface directly connected using the web the way initialization. Which nether following statements are true?",
                new LinkedList<String>(){
                    {
                        add("Manage PC browser access http://192.168.0.1");
                        add("IP address ofthe management PC is manually set to 192.168.0.2-'92.168.0.254");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Manage PC browser access http://192.168.1.1");
                        add("Set the NIC ofthe management PC to automatically obtain the IP address.");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number

        ));

        multipleChoices.add(new MultipleChoice(
                "About the description of firewall active-standby, which of the following is correct?",
                new LinkedList<String>(){
                    {
                        add("When a plurality of regions on the firewall needs to provide dual-machine backup function, you need to configure multiple VRRP backup groups on the firewall.");
                        add("It requires the state of all the VRRP backup groups in the same VGMP management group on the same firewall should be consistent. ");
                        add("VGMP is to ensure all VRRP backup groups' consistency of switching");
                    }
                },
                new LinkedList<String>(){
                    {

                        add("The firewall active-standby requires the information such as the session table. MAC table, routing table and so on synchronous backup between primary devices and slave devices.");
                    }
                },
                ChapterName.DualSystemHotStandby.number

        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following are correct regarding the matching conditions of the security policy?",
                new LinkedList<String>(){
                    {
                        add("'The source security zone' is an optional parameter in the matehing condition.");
                        add("\"Time period\" in the matching condition is an optional parameter");
                        add("\"Apply\" in the matching condition is an optional parameter");
                        add("\"Service\" is an optional parameter in the matching condition");
                    }
                },
                new LinkedList<String>(){
                    {

                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number


        ));
        multipleChoices.add(new MultipleChoice(
                "Fire Trust domain FTP client wants to access an Um.rust server FTP service has allowed the client: to access the server TCP 21 port, the client in the Windows command line window can log into the FTP server, but can not download the file, what are the following solutions?",
                new LinkedList<String>(){
                    {
                        add("Take the Trust between Un:rust domain to allow two-way default access strategy");
                        add("The fTP works with the port mode modify the Untru3t Trust domain to allow the inbound direction between the default access strategy");
                        add("Trust Untrust domain configuration is enabled detect ftp (");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("FTP works with Passive mode modify the domain inbound direction betv/een the Untrust Trust default access policy to allow");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following is true about the description of the TCP/IP protocol stack packet encapsulation?",
                new LinkedList<String>(){
                    {
                        add("The data packet is first transmitted to the data link layer. After parsing, the data link layer information is stripped, and the network layer information is known according to the parsing information, such as IP.");
                        add("After the application layer receives the data packet, the application layer information is stripped after parsing, and the user data displayed at the end is exactly the same as the data sent by the sender host.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("After the transport layer (TCP) receives the data packet, the transport layer information is stripped after parsing, and the upper layer processing protocol, such as UDP, is known according to the parsing information");
                        add("After receiving the data packet, the network layer is stripped after parsing, and the upper layer processing protocol is known according to the parsing information, such as HTTP");
                    }
                },
                ChapterName.BasicNetworkConcepts.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are malicious programs?",
                new LinkedList<String>(){
                    {
                        add("Trojan horse");
                        add("F C. worm");
                        add("F D. Virus");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Vulnerabilities");
                    }
                },
                ChapterName.CommonInformationSecurityThreats.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following are key elements of information security prevention?",
                new LinkedList<String>(){
                    {
                        add("Asset management");
                        add("Security operation and management");
                        add("Security products and technologies");
                        add("Personnel");
                    }
                },
                new LinkedList<String>(){
                    {

                    }
                },
                ChapterName.BasicConceptofInformationSecurity.number
        ));
        multipleChoices.add(new MultipleChoice(
                "Which of the following statements about Client-Initiated VPN is correct?",
                new LinkedList<String>(){
                    {
                        add("A tunnel is established between each access user and the LNS");
                        add("Only one L2TP session and PPP connection are carried in each tunnel.");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Each tunnel carries multiple L2TP sessions and PPP connections.");
                        add("Each tunnel carries multiple L2TP sessions and one PPP connection.");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following options are suppoied by VPN technology to encrypt data messages?",
                new LinkedList<String>(){
                    {
                        add("SSL VPN");
                        add("IPSec VPN");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("GRE VPN");
                        add("L2TP VPN");
                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number

        ));

        multipleChoices.add(new MultipleChoice(
                "Regarding the problem that the two-way binding user of the authentication-free method cannot access the network resources, which of the following options are possible reasons?",
                new LinkedList<String>(){
                    {
                        add("The authentication-free user does not use the PC with the specified IP/MAC");
                        add("Online users have reached a large value");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("The authentication-free user and the authenticated user are in the same security zone");
                        add("The authentication action in the authentication policy is se- to \"No credit / free authentication\"");
                    }
                },
                ChapterName.HostFirewallsandAntivirusSoftware.number
        ));

        multipleChoices.add(new MultipleChoice(
                "ASPF (Application Specific Packet Filter) is a kind of packet filtering based on the application layer, it checks the application layer protocol information and monitor the connection state of the application layer protocol. ASPF by Server Map table achieves a special security mechanism. Which statement about ASPF and Server map table are correct? ",
                new LinkedList<String>(){
                    {
                        add("ASPF monitors the packets in the process of communication (");
                        add("ASPF dynamically create and delete filtering rules");
                        add("ASPF through server map table realize dynamic to allow multi-channel protocol data to pass");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("Quintuple server-map entries achieve a similar functionality with session table");
                    }
                },
                ChapterName.IntroductiontoFirewalls.number
        ));

        multipleChoices.add(new MultipleChoice(
                "What are the advantages of address translation techniques included?",
                new LinkedList<String>(){
                    {
                        add("Address conversion can make internal network users (private IP address) easy access to the Internet");
                        add("Many host address conversion can make the internal LAN to share an IP address on the Internet");
                        add("Address conversion can block internal network users, improve the safety of internal network");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Address conversion that can handle the IP header of encryption");
                    }
                },
                ChapterName.NetworkAddressTranslation.number
        ));

        multipleChoices.add(new MultipleChoice(
                "Regarding the relationship and role of VRRPA/GMP/HRP. which of the following statements are correct?",
                new LinkedList<String>(){
                    {
                        add("VRRP is responsible for sending free ARP to direct traffic to the new primary device during active/standby switchover.");
                        add("VGMP is responsible for monitoring equipment failures and controlling fast switching of equipment.");
                        add("HRP is responsible for data backup during hot standby operation");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("VGMP group in the active state may include the VRRP group in the standby state");
                    }
                },
                ChapterName.DualSystemHotStandby.number

        ));

        multipleChoices.add(new MultipleChoice(
                "Which ofthe following are core elements of the IATF (Information Assurance Technology Framework) model?",
                new LinkedList<String>(){
                    {
                        add("person");
                        add("Technology");
                        add("Operation");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Environment");
                    }
                },
                0
        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following are multi-user operating systems?",
                new LinkedList<String>(){
                    {
                        add("UNIX");
                        add("LINUX");
                        add("Windows");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("MSDOS");
                    }
                },
                ChapterName.OperatingSystemOverview.number

        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following options can be used in the advanced settings of Windows Firewall?",
                new LinkedList<String>(){
                    {
                        add("Restore defaults");
                        add("Change notification rules");
                        add("Set connection security rules");
                        add("Set out inbound rules");

                    }
                },
                new LinkedList<String>(){
                    {

                    }
                },
                ChapterName.HostFirewallsandAntivirusSoftware.number
        ));


        multipleChoices.add(new MultipleChoice(
                "Intrusion prevention system technical characteristics include",
                new LinkedList<String>(){
                    {
                        add("Online mode");
                        add("Real-time blocking");
                        add("Self-learning and adaptive");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Straight road deployment");
                    }
                },
                ChapterName.OverviewofIntrusionPrevention.number
        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following information will be encrypted during the use of digital envelopes?",
                new LinkedList<String>(){
                    {
                        add("Symmetric key");
                        add("User data");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Receiver private key");
                        add("Receiver public key");

                    }
                },
                ChapterName.EncryptionandDecryptionMechanism.number
        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following are in the certification area of IS027001?",
                new LinkedList<String>(){
                    {
                        add("Access control");
                        add("Personnel safety");
                        add("Vulnerability management");
                        add("Business continuity management");

                    }
                },
                new LinkedList<String>(){
                    {
                    }
                },
                ChapterName.InformationSecurityStandardsandSpecifications.number
        ));

        multipleChoices.add(new MultipleChoice(
                "Against Buffer overflow attacks, which description is correct?",
                new LinkedList<String>(){
                    {
                        add("Buffer overflow attack is use of the software system on memory operating defects, by using high operating permission to run attack code");
                        add("Buffer overflow attack is the most common method of attack software system's behaviors");
                        add("Buffer overflow attack belongs to the application layer attack behavior");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Buffer overflow attack has nothing to do with operating system's vulnerabilities and architecture");
                    }
                },
                0
        ));

        multipleChoices.add(new MultipleChoice(
                "Security technology has different approaches at different technical levels and areas. Which of the following devices can be used for network layer security protection?",
                new LinkedList<String>(){
                    {
                        add("Firewall");
                        add("Anti-DDoS equipment");
                        add("IPS/IDS equipment");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("Vulnerability scanning device");
                    }
                },
                ChapterName.CommonNetworkDevices.number
        ));

        multipleChoices.add(new MultipleChoice(
                "Which of the following are part of the SSL VPN function?",
                new LinkedList<String>(){
                    {
                        add("User authentication");
                        add("File sharing");
                    }
                },
                new LinkedList<String>(){
                    {
                        add("WEB rewriting");
                        add("Port scanning");

                    }
                },
                ChapterName.ApplicationofCryptographicTechnologies.number
        ));

        multipleChoices.add(new MultipleChoice(
                "Which ofthe following are the standard port numbers for the FTP protocol?",
                new LinkedList<String>(){
                    {
                        add("20");
                        add("21");

                    }
                },
                new LinkedList<String>(){
                    {
                        add("80");
                        add("23");
                    }
                },
                ChapterName.BasicNetworkConcepts.number
        ));

    }


    public MyQuestions getExamQuestions(){
        MyQuestions questions=new MyQuestions();
        Collections.shuffle(trueAndFalses);
        questions.setTrueAndFalses(((ArrayList<TrueAndFalse>) trueAndFalses.clone()).subList(0,15));
        Collections.shuffle(singleChoices);
        questions.setSingleChoices(((ArrayList<SingleChoice>) singleChoices.clone()).subList(0,25));
        Collections.shuffle(multipleChoices);
        questions.setMultipleChoices(((ArrayList<MultipleChoice>) multipleChoices.clone()).subList(0,20));
        return questions;
    }

    public MyQuestions getLittleExamQuestions(){
        MyQuestions questions=new MyQuestions();
        Collections.shuffle(trueAndFalses);
        questions.setTrueAndFalses(((ArrayList<TrueAndFalse>) trueAndFalses.clone()).subList(0,3));
        Collections.shuffle(singleChoices);
        questions.setSingleChoices(((ArrayList<SingleChoice>) singleChoices.clone()).subList(0,3));
        Collections.shuffle(multipleChoices);
        questions.setMultipleChoices(((ArrayList<MultipleChoice>) multipleChoices.clone()).subList(0,3));
        return questions;
    }
    public static MyQuestions getAllQueations(){
        MyQuestions questions=new MyQuestions();
        questions.setTrueAndFalses(trueAndFalses);
        questions.setMultipleChoices(multipleChoices);
        questions.setSingleChoices(singleChoices);
        Collections.sort(questions);
        return questions;
    }
    public MyQuestions getQuizTrueandFalseQuestions(){
        MyQuestions questions=new MyQuestions();
        Collections.shuffle(trueAndFalses);
        questions.setTrueAndFalses(((ArrayList<TrueAndFalse>) trueAndFalses.clone()).subList(0,10));
        return questions;
    }
    public MyQuestions getQuizSingleChoiceQuestions(){
        MyQuestions questions=new MyQuestions();
        Collections.shuffle(singleChoices);
        questions.setSingleChoices(((ArrayList<SingleChoice>) singleChoices.clone()).subList(0,10));
        return questions;
    }
    public MyQuestions getQuizMultipleChoiceQuestions(){
        MyQuestions questions=new MyQuestions();
        Collections.shuffle(multipleChoices);
        questions.setMultipleChoices(((ArrayList<MultipleChoice>) multipleChoices.clone()).subList(0,10));
        return questions;
    }
}