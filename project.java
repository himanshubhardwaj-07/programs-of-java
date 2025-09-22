import java.io.*;
import java.util.*;

// ---------------- Entity Classes -----------------
class Voter implements Serializable {
    private String voterId;
    private String password;
    private boolean hasVoted;

    public Voter(String voterId, String password) {
        this.voterId = voterId;
        this.password = password;
        this.hasVoted = false;
    }

    public String getVoterId() { return voterId; }
    public String getPassword() { return password; }
    public boolean hasVoted() { return hasVoted; }
    public void setVoted(boolean voted) { this.hasVoted = voted; }
}

class Candidate implements Serializable {
    private String name;
    private String party;
    private int votes;

    public Candidate(String name, String party) {
        this.name = name;
        this.party = party;
        this.votes = 0;
    }

    public String getName() { return name; }
    public String getParty() { return party; }
    public int getVotes() { return votes; }
    public void addVote() { votes++; }
}

// ---------------- Manager Class -----------------
class ElectionManager {
    private List<Voter> voters = new ArrayList<>();
    private List<Candidate> candidates = new ArrayList<>();

    public ElectionManager() {
        // Gujarati names with Indian parties
        candidates.add(new Candidate("Narendra Patel", "Bharatiya Janata Party (BJP)"));
        candidates.add(new Candidate("Rameshbhai Desai", "Indian National Congress (INC)"));
        candidates.add(new Candidate("Jignesh Mehta", "Aam Aadmi Party (AAP)"));
        candidates.add(new Candidate("Manish Shah", "Nationalist Congress Party (NCP)"));
        candidates.add(new Candidate("Kiranben Joshi", "Independent"));
    }

    // Register voter
    public void registerVoter(String id, String pass) throws Exception {
        for (Voter v : voters) {
            if (v.getVoterId().equals(id)) {
                throw new Exception("User already exists!");
            }
        }
        voters.add(new Voter(id, pass));
        System.out.println("✅ Registration successful!");
    }

    // Login voter
    public Voter login(String id, String pass) throws Exception {
        for (Voter v : voters) {
            if (v.getVoterId().equals(id) && v.getPassword().equals(pass)) {
                return v;
            }
        }
        throw new Exception("❌ Invalid credentials!");
    }

    // Cast vote
    public void vote(Voter voter, int choice) throws Exception {
        if (voter.hasVoted()) {
            throw new Exception("❌ You have already voted!");
        }
        if (choice < 1 || choice > candidates.size()) {
            throw new Exception("❌ Invalid candidate choice!");
        }
        candidates.get(choice - 1).addVote();
        voter.setVoted(true);
        System.out.println("✅ Vote cast successfully!");
    }

    // Display results
    public void showResults() {
        System.out.println("\n📊 Election Results:");
        for (Candidate c : candidates) {
            System.out.println(c.getName() + " (" + c.getParty() + ") → " + c.getVotes() + " votes");
        }
    }

    // getter for candidates
    public List<Candidate> getCandidates() {
        return candidates;
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

            try {
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
                        System.out.println("✅ Login successful!");
                        break;

                    case 3:
                        if (loggedIn == null) {
                            System.out.println("⚠ Please login first!");
                        } else {
                            System.out.println("Candidates:");
                            int i = 1;
                            for (Candidate c : manager.getCandidates()) {
                                System.out.println(i++ + ". " + c.getName() + " (" + c.getParty() + ")");
                            }
                            System.out.print("Enter your choice: ");
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
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
