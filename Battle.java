import java.util.InputMismatchException;
import java.util.Scanner;

public class Battle {
//     public static void main(String[] args) {
//     int hpHero = 1000, hpEnemy = 1000;
//     String wpHero = "Sword";
//     String wpEnemy = "Magic Wand";
//     int atkHero = 100, atkEnemy = 80;

//     // menentukan siapa duluan yuuukk
//     // jangkauan: 10, minimum: 1
//     int gg = ((int) (Math.random() * 10)) + 1;
//     // System.out.println(gg);

//     do {
      
//       if (gg % 2 == 0) { // Enemy
//         hpHero -= atkEnemy;
//         System.out.println("Enemy casting magic! Whooozzzz!");
//         System.out.println("HP Hero: " + hpHero);
//         System.out.println("HP Enemy: " + hpEnemy);
//         gg++; // supaya loop berikutnya jadi ganjil

//       } else { // Hero
//         System.out.println("Mau ngapain?");
//         System.out.println("(a)ttack");
//         System.out.println("(h)eal");
//         System.out.println("(k)abur");
  
//         Scanner sc = new Scanner(System.in);
//         char action = sc.next().charAt(0);
  
//         switch(action) {
//           case 'a':
//             hpEnemy -= atkHero;
//             System.out.println("Hero attack: " + atkHero);
//             System.out.println("HP Hero: " + hpHero);
//             System.out.println("HP Enemy: " + hpEnemy);
//             break;
//           case 'h':
//             hpHero += 400;
//             if (hpHero > 1000) hpHero = 1000;
//             System.out.println("Hero-nya healing...");
//             System.out.println("HP Hero: " + hpHero);
//             break;
//           case 'k':
//             System.out.println("Eh, kabur dulu ah...");
//             return; // keluar dari program.
//           default: System.out.println("Mau ngapain?");
//         }
        
//         gg--;
//       }
    
//     }         // lakukan (ulang battle)
//     while (hpHero > 0 && hpEnemy > 0);     
//     // selama hpHero > 0 dan hpEnemy > 0
    
//     if (hpHero <= 0) System.out.println("Game Over!");
//     else if (hpEnemy <= 0) System.out.println("Horrrreee! Menang!");
    
    
    
//   }

    
    public static void main(String[] args) {
        // Buat Scanner utama dan Intro Game
        Scanner go = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("||ANAK ANAK KUCING THE BATTLE||");
        System.out.println("------------------------------------------------------------");
        System.out.print("Press ENTER to Continue...");go.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("------------------------------------------------------------");
        // Declare banyakk sekali variabel
        int hero = 0, HP = 0, mHP = 0, BAtk = 0, Atk = 0, heal = 0;
        int musuhmu;
        int berserk = 0, shield = 0, eat = 0;
        int reflect = 0, shieldstam = 10;
        int shieldstamnext = 0;
        String Enama = "Enama", weap = "weap";
        int minicritDMG = 0;
        // Pemilihan Character, ada 3 character yang bisa di pilih. Yaitu Azam Zam, Apip Pip dan Aldo Do, masing masing memiliki kelebihan mereka dan kekurangan.
        // Setiap Character memiliki 1 skill masing"
        System.out.println("Pick your Character!");
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Azam Zam \nAtk   : 50\nHP    : 225 \nSkill : Lunch Time \n\n2. Apip Pip \nAtk   : 30\nHP    : 350 \nSkill : Sandal Throw \n\n3. Aldo Do \nAtk   : 65\nHP    : 180\nSkill : Laptop Shield ");
        System.out.println("------------------------------------------------------------");
        System.out.print("Your Pick: ");
        hero = go.nextInt();
        System.out.println("------------------------------------------------------------");
        // Pemilihan menggunakan SwitchCase *ADA CHAR RAHASIA BILA MENGINPUT TANGGAL ULTAH SAYA yaitu : 23*
        switch (hero) {
            case 1:
                System.out.println("You are Azam Zam \nYour are using a Lunch Box as your weapon");
                HP = 225; BAtk = 50;
                mHP=HP;
                heal = mHP/15;
                eat = 1;           
                weap = "Lunch Box";  
                break;
            case 2:
                System.out.println("You are Apip Pip \nYour are using a Sandal as your weapon ");
                HP = 350; BAtk = 30;
                mHP= HP;
                heal = mHP/7;
                berserk = 1;
                weap = "Sandal"; 
                break;
            case 3:
                System.out.println("You are Aldo Do \nYour are using a Laptop as your weapon");
                HP = 180; BAtk = 65;
                mHP= HP;
                heal = mHP/5;
                shield = 1;
                weap = "Laptop"; 
                break;
            case 23:
                System.out.println("Secret Character!!!");
                System.out.println("------------------------------------------------------------");
                System.out.println("You are The Programer now!!!");
                System.out.println("You can now create your own character!!!");
                System.out.println("------------------------------------------------------------");
                System.out.print("HP  :  "); HP      = go.nextInt();
                System.out.print("Atk :  "); BAtk    = go.nextInt();
                System.out.print("Heal: +"); heal    = go.nextInt();
                System.out.println("------------------------------------------------------------");
                System.out.println("Now Select The Skill You Want To Unlock!!!");
                System.out.println("1. Lunch Time\n(Y)es|(N)o");
                System.out.println("------------------------------------------------------------");
                System.out.print("Your Will : ");
                char SelectSkill = go.next().charAt(0);
                switch (SelectSkill) {
                    case 'Y':
                    case 'y': 
                    
                        System.out.println("Skill Activated!!!");
                        System.out.println("------------------------------------------------------------");
                        eat = 1;
                        break;
                    case 'N':
                    case 'n':
                    System.out.println("------------------------------------------------------------");
                        break;
                }
                System.out.println("1. Sandal Throw\n(Y)es|(N)o");
                System.out.println("------------------------------------------------------------");
                System.out.print("Your Will : ");
                SelectSkill = go.next().charAt(0);
                switch (SelectSkill) {
                    case 'Y':
                    case 'y': 
                        System.out.println("Skill Activated!!!");
                        System.out.println("------------------------------------------------------------");
                        berserk = 1;
                        break;
                    case 'N':
                    case 'n':
                        System.out.println("------------------------------------------------------------");
                        break;
                }
                System.out.println("1. Laptop Shield\n(Y)es|(N)o");
                System.out.println("------------------------------------------------------------");
                System.out.print("Your Will : ");
                SelectSkill = go.next().charAt(0);
                switch (SelectSkill) {
                    case 'Y':
                    case 'y': 
                        System.out.println("Skill Activated!!!");
                        System.out.println("------------------------------------------------------------");
                        shield = 1;
                        break;
                    case 'N':
                    case 'n':
                        System.out.println("------------------------------------------------------------");
                        break;
                }

                break;
                
                default :
                System.out.println("You are just an NPC \nYour are using a Imagination as your weapon");
                HP = 1; BAtk = 1;
                mHP= HP;
                heal = mHP;
                weap = "Imagination"; 
                break;
        }

        // Pembuatan Musuh dengan random menggunakan Scase
        Atk= BAtk;
        System.out.println("------------------------------------------------------------");
        musuhmu = (int) (Math.random()*10);
        switch (musuhmu) {
            case 0:
                Enama = "Desindy";
                break;
            case 1:
                Enama = "Winanda";
                break;
            case 6:
                Enama = "Mustika";
                break;
            case 2:
                Enama = "Salma";
                break;
            case 7:
                Enama = "Alda";
                break;
            case 3:
            case 8:
                Enama = "Rara";
                break;
            case 4:
            case 9:
                Enama = "Kiyya";
                break;
            case 5:
            case 10:
                Enama = "Eva";
                break;
        }
        // Intro Battle dengan banyak output dan declarasi
        System.out.println("Prepare yourself \nYour enemy is Nyai Roro " + Enama);
        System.out.println("------------------------------------------------------------");
        System.out.print("Press ENTER to Continue...");
        go.nextLine();go.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        int HPe = 650, mHPe=HPe, Atke = 35;
        int healE = HPe/10;
        int first = (int) (Math.random() * 10); 
       // Perulangan Battle dengan for yang menggunakan "gelut" sebagai variabel inti
        for( int gelut = 1; gelut == 1;) {
            minicritDMG = (int) (Math.random()*10);
        if ( first % 2 == 0) {
            System.out.println("\n\n\n\n\n\n\n");
            if( shield == 1) {
                reflect = 0;
                System.out.println("------------------------------------------------------------");
                System.out.println("Your Shield     : " + shieldstam);
                }
            System.out.println("------------------------------------------------------------");
            System.out.println("Select your Action");
            System.out.println("------------------------------------------------------------");
            System.out.println("\n(a)ttack\n(h)eal\n(f)lee");
            System.out.println("------------------------------------------------------------");
            char action = go.next().charAt(0);
            System.out.println("------------------------------------------------------------");
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("------------------------------------------------------------");
            switch (action) {
                case 'a':
                    System.out.println("YOUR TURN");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("Attacking with your " + weap);
                    // Skill Char kitaa
                    if ( eat == 1) { // Jika memiliki Skill Lunch Time
                        int lunch = (int) (Math.random()*10);
                        if ( lunch % 10 == 0 ) {
                            System.out.println("You eat your lunch!!!\nFullfill your HP!!!");
                            HP += mHP;
                        }
                    }
                    if ( berserk == 1) { // Jika kita memiliki Skill Sandal Throw
                        int berserkstam = (int) (Math.random()*100);
                        if (berserkstam % 3 == 0) { 
                            Atk = 3 * (BAtk + minicritDMG);
                            System.out.println("You throw your Sandal!!!\nYou deal Critical DMG!!!");
                        }
                    }
                    
                    if ( shield == 1) { // Jika kita memiliki Skill Laptop Shield
                        int shielduse = (int) (Math.random()*10);
                        if (shielduse % 3 == 0 ) {
                        System.out.println("Using your laptop as a shield!!!");
                        shieldstam = 10 - shieldstamnext;
                        if ( shieldstam >= 1) {
                            shieldstamnext++;
                            reflect = 1;
                            
                        }        
                        
                    }
                    } // lanjut dengan atk biasa yang sudah di modif
                    HPe -= Atk + minicritDMG;
                    System.out.println("You deal " + (Atk + minicritDMG) + " dmg");
                    Atk = BAtk;
                    
                    

                    break;
                case 'h': // Healingg
                    System.out.println("You are using your healing potion...");
                    System.out.println("Your HP incrasing by : " + heal);
                    HP += heal;
                    if (HP > mHP) {
                        HP = mHP;
                    
                    } 
                    
                    break;                    
                case 'f': // Kaburr dan end program
                    System.out.println("You run from the Battle");
                    return;
            }
            
            System.out.println("Your HP         : " + HP);
            System.out.println("Nyai Roro HP    : " + HPe);
            System.out.println("------------------------------------------------------------");
            first = 1;
            // End Battle jika HP Char kita atau Enemy kurang dari 0
            if ( HP <= 0) {
                System.out.println("GAME OVER");
                System.out.println("------------------------------------------------------------");
                return;
            }
            else if ( HPe <= 0 ) {
                System.out.println("------------------------------------------------------------");
                System.out.println("YOU WIN");
                System.out.println("------------------------------------------------------------");
                return;
            } 
        }
        else {
            System.out.println("NYAI'S TURN");
            System.out.println("------------------------------------------------------------");
            int Eact = (int) (Math.random() * 100);
            if ( Eact % 2 == 0) {
                System.out.println("Nyai Roro " + Enama + " using her magick towards you!!!");
                
                if (reflect == 1) {
                    System.out.println("Nyai's attack deflected by your shield!!");
                    HPe -= Atke + minicritDMG;   
                    System.out.println("Dealing " + (Atke + minicritDMG) + " dmg toward herself!!!");

                }
                else {
                int Ultimate = (int) (Math.random()*10);
                if ( Ultimate == 5) {
                    Atke  *= 2;
                    System.out.println("Nyai's Atk incresed to " + Atke + "!!!" );
                } 
                HP -= Atke + minicritDMG;
                System.out.println("Nyai Roro deal " + (Atke + minicritDMG) + " dmg");
            }
            }
            else if (Eact % 50 == 0) {
                System.out.println("------------------------------------------------------------");
                System.out.println("Nyai Roro " + Enama + " kabur!!!");
                System.out.println("------------------------------------------------------------");
                return;
                
            }
            else {
                System.out.println("Nyai Roro " + Enama + " is healing...");
                HPe += healE;
                System.out.println("Nyai's HP healed by " + healE);
                if ( HPe > mHPe) {
                    HPe = mHPe;
                }
                
            }
            System.out.println("Your HP         : " + HP);
            System.out.println("Nyai Roro HP    : " + HPe);
            System.out.println("------------------------------------------------------------");
            
            first=2;
            // End Battle jika HP Char kita atau Enemy kurang dari 0
            if ( HP <= 0) {
                System.out.println("------------------------------------------------------------");
                System.out.println("GAME OVER");
                System.out.println("------------------------------------------------------------");
                return;
            }
            else if ( HPe <= 0 ) {
                System.out.println("------------------------------------------------------------");
                System.out.println("YOU WIN");
                System.out.println("------------------------------------------------------------");
                return;
            } 

        }
    }



 

    }
}
