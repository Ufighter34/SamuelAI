public class AIrecommend extends GetterandSetter{
  private String a = "";
  private String[] list = new String[]{"ways of having a healthy lifestyle", "effective study methods", "managing time better"};
  private String [] healthyLiving = new String[]{"According to Delaware.gov, maintain steady fitness, develop healthy eating habits, and try to lose weight", "According to who.int, you should have a healthy diet that has a even balance of foods originating from plants, bread, and vegetables, keep track of your body weight and maintain fat intake, use dairy products that are low in fat and salt, choose a low salt-diet, and prepare food in a hygenic way", "10 tips for maintaining a healthy lifestyle include measuring and watching your weight, stay away from unhealthy foods and eat healthier, stay hydrated with water and limit drinking other beverages, stay physically active, reduce screen time, get a significant amount of sleep, find ways of managing your emotions, and consider using an app to assist with this lifestyle. "};
  private String[] studyMethods = new String[]{"According to usa.edu, you should sleep well, change your study enviornment, stay in any good studying enviornemnt, listen to claiming music, get rid of distractions, and bring/eat decent snacks", "A good way to study is using the SQ3R method. The method includes surveying your material through skimming through it, develop questions about the material, read over your material, recite it, then finally review it.", "You could try retrieval practice, which includes completing practice tests, developing your own questions, and using flashcards.", "You could use the PQR4 method, which is when you preview your material, develop qeustions about the topic, read over the information, reflect over the material and your questions, recite your information, and then review your material", "Something you could try is the Feyman technique, which is writing the subject or concept on a sheet of paper, explain it aloud, review your information and see if you made any mistakes, then rewrite the information in simplar terms", "You can color code your notes, having the key notes in red, highlighting important information in yellow, and organizing topics by color. When doing so, do not color code everything, just the important facts."};
  private String[] timeManagement = new String[]{"According to Slack.com, 10 tips on managing time include knowing how you will spend the time, creating and maintaining a daily schedule, prioritizing what you need to do, completing the most difficult tasks first, grouping similar tasks together to work on later, setting time limits for yourself to complete your work, learning when to stop, work on one thing at a time, staying organized while working, and using time managment tools like Google Calender or Dropbox", "According to the CFI team, to manage your time you need to set your goals correctly, prioritize what you need to do, set a time limit to complete a task, take breaks inbetween work, stay organized, remove anything that isn't essential from your day to gain more time, and plan ahead", "According to the Lucid Content Team, 10 tips for managing time include figuring out how you are spending your time now, developing a daily schedule and sticking to it, prioritizing wisely, grouping similar tasks together, trying not to multitask, giving each task a time limit, inserting breaks inbetween your tasks, saying no to  unimportant tasks, staying organized, and eliminating any distractions in any way possible."};
  public AIrecommend(String a, int k){
    super(k);
    this.a=a;
  }
public void displayRecs(){
  System.out.print("I can recommend ");
  for(int i=0; i<list.length; i++){
    System.out.print(list[i]);
    if(i==list.length-2){
      System.out.print(" and ");
    }
      else if(i==list.length-1){
        System.out.print(".");
      }
    else{
      System.out.print(", ");
    }
  }
  System.out.println("\nAnything else you want me to do?");
}
public String recommendations(String selection){
  int index=0;
String answer="";
  if(selection.toUpperCase().indexOf("STUDYING")!=-1||selection.toUpperCase().indexOf("STUDY METHODS")!=-1){
  index=(int)(Math.random()*(studyMethods.length-2+1)+1);
  answer+=studyMethods[index];
  }
  else if(selection.toUpperCase().indexOf("HEALTHY LIVING")!=-1||selection.toUpperCase().indexOf("LIVE HEALTHIER")!=-1){
    index=(int)(Math.random()*(healthyLiving.length-2+1)+1);
    answer+=healthyLiving[index];
  }
  else if(selection.toUpperCase().indexOf("TIME MANAGEMENT")!=-1||selection.toUpperCase().indexOf("MANAGING MY TIME")!=-1){
    index=(int)(Math.random()*(timeManagement.length-2+1)+1);
    answer+=timeManagement[index];
  }
  return answer+"\nAnything else you want me to do?";
}
}