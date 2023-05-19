public class AIrecommend{
  private String a = "";
  private String [] healthyLiving = new String[]{"According to Delaware.gov, maintain steady fitness, develop healthy eating habits, and try to lose weight", "According to who.int, you should have a healthy diet that has a even balance of foods originating from plants, bread, and vegetables, keep track of your body weight and maintain fat intake, use dairy products that are low in fat and salt, choose a low salt-diet, and prepare food in a hygenic way", "10 tips for maintaining a healthy lifestyle include measuring and watching your weight, stay away from unhealthy foods and eat healthier, stay hydrated with water and limit drinking other beverages, stay physically active, reduce screen time, get a significant amount of sleep, find ways of managing your emotions, and consider using an app to assist with this lifestyle. "};
  private String[] studyMethods = new String[]{"According to usa.edu, you should sleep well, change your study enviornment, stay in any good studying enviornemnt, listen to claiming music, get rid of distractions, and bring/eat decent snacks", "A good way to study is using the SQ3R method. The method includes surveying your material through skimming through it, develop questions about the material, read over your material, recite it, then finally review it.", "You could try retrieval practice, which includes completing practice tests, developing your own questions, and using flashcards.", "You could use the PQR4 method, which is when you preview your material, develop qeustions about the topic, read over the information, reflect over the material and your questions, recite your information, and then review your material", "Something you could try is the Feyman technique, which is writing the subject or concept on a sheet of paper, explain it aloud, review your information and see if you made any mistakes, then rewrite the information in simplar terms", "You can color code your notes, having the key notes in red, highlighting important information in yellow, and organizing topics by color. When doing so, do not color code everything, just the important facts."};
  public AIrecommend(String a){
    this.a=a;
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
  return answer+"\nAnything else you want me to do?";
}
}