import java.util.*;

class RRT {
    private int ticketNo;
    private String raisedBy;
    private String assignedTo;
    private int priority;
    private String project;

    RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project) {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public int getPriority() {
        return priority;
    }

    public String getProject() {
        return project;
    }

    public String getRaisedBy() {
        return raisedBy;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    // Setters are not required as we are giving input using Constructor

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public void setRaisedBy(String raisedBy) {
        this.raisedBy = raisedBy;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

}

public class MyClass {

    public static RRT getHighestPriorityTicket(RRT[] arr, String project) {


        RRT ans = null;
        int mini = 1000;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].getProject().equals(project) && arr[i].getPriority() < mini)
            {
                mini = arr[i].getPriority();
                ans = arr[i];
            }
        }


        return ans;
    }

    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        RRT arr[] = new RRT[4];
        for (int i = 0; i < 4; i++) {
            int ticketNo = sc.nextInt();
            sc.nextLine();

            String raisedBy = sc.nextLine();
            String assignedTo = sc.nextLine();
            int priority = sc.nextInt();
            sc.nextLine();

            String project = sc.nextLine();

            RRT obj = new RRT(ticketNo, raisedBy, assignedTo, priority, project);

            arr[i] = obj;

        }

        String project = sc.nextLine();

        RRT obj = getHighestPriorityTicket(arr, project);

        if (obj == null) {
            System.out.println("No such Ticket");
        } else {
            System.out.println(obj.getTicketNo());
            System.out.println(obj.getRaisedBy());
            System.out.println(obj.getAssignedTo());
        }

        sc.close();
    }
}