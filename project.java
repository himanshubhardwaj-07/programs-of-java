import java.util.ArrayList;
import java.util.Scanner;

// ---------------- Voter Class -----------------
class Voter {
    String voterId;
    String password;
    boolean hasVoted;

    Voter(String voterId, String password) {
        this.voterId = voterId;
        this.password = password;
        this.hasVoted = false;
    }
}

// ---------------- Candidate Class -----------------
class Candidate {
    String name;
    String party;
    int votes;

    Candidate(String name, String party) {
        this.name = name;
        this.party = party;
        this.votes = 0;
    }
}

// ---------------- Election Manager -----------------
class ElectionManager {
    ArrayList<Voter> voters = new ArrayList<>();
    ArrayList<Candidate> candidates = new ArrayList<>();

    ElectionManager() {
        // Gujarati names and Indian parties
        candidates.add(new Candidate("Narendra Patel", "BJP"));
        candidates.add(new Candidate("Rameshbhai Desai", "INC"));
        candidates.add(new Candidate("Jignesh Mehta", "AAP"));
        candidates.add(new Candidate("Manish Shah", "NCP"));
        candidates.add(new Candidate("Kiranben Joshi", "Independent"));
    }

    void registerVoter(String id, String pass) {
        for (Voter v : voters) {
            if (v.voterId.equals(id)) {
                System.out.println("❌ User already exists!");
                return;
            }
        }
        voters.add(new Voter(id, pass));
        System.out.println("✅ Registration successful!");
    }

    Voter login(String id, String pass) {
        for (Voter v : voters) {
            if (v.voterId.equals(id) && v.password.equals(pass)) {
                System.out.println("✅ Login successful!");
                return v;
            }
        }
        System.out.println("❌ Invalid credentials!");
        return null;
    }

    void vote(Voter voter, int choice) {
        if (voter.hasVoted) {
            System.out.println("❌ You have already voted!");
            return;
        }
        if (choice < 1 || choice > candidates.size()) {
            System.out.println("❌ Invalid choice!");
            return;
        }
        candidates.get(choice - 1).votes++;
        voter.hasVoted = true;
        System.out.println("✅ Vote cast successfully!");
    }

    void showResults() {
        System.out.println("\n📊 Election Results:");
        for (Candidate c : candidates) {
            System.out.println(c.name + " (" + c.party + ") → " + c.votes + " votes");
        }
    }

    void showCandidates() {
        System.out.println("Candidates:");
        int i = 1;
        for (Candidate c : candidates) {
            System.out.println(i + ". " + c.name + " (" + c.party + ")");
            i++;
        }
    }
}

// ---------------- Main Class -----------------
public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectionManager manager = new ElectionManager();
        Voter loggedIn = null;

        while (true) {
            System.out.println("\n--- E-Voting Menu ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Vote");
            System.out.println("4. Results");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Voter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Password: ");
                    String pass = sc.nextLine();
                    manager.registerVoter(id, pass);
                    break;

                case 2:
                    System.out.print("Enter Voter ID: ");
                    id = sc.nextLine();
                    System.out.print("Enter Password: ");
                    pass = sc.nextLine();
                    loggedIn = manager.login(id, pass);
                    break;

                case 3:
                    if (loggedIn == null) {
                        System.out.println("⚠ Please login first!");
                    } else {
                        manager.showCandidates();
                        System.out.print("Enter candidate number to vote: ");
                        int voteChoice = sc.nextInt();
                        manager.vote(loggedIn, voteChoice);
                    }
                    break;

                case 4:
                    manager.showResults();
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice, try again!");
            }
        }
    }
}
