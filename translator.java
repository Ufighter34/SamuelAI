import java.util.ArrayList;
public class translator extends AIrecommend{
  private String language;
  private String[] spanish = new String[]{"cierto", "Ella", "El", "Yo", "Tu", "Nosotros/nosotras", "ellos/ellas", "estudiantes", "profesora/profesor", "examen", "silla", "escritorio", "puerta", "cocina", "sala de estar", "dormitorio", "cama", "videojuegos", "jugar", "correr", "volar", "manejar", "zapatos", "pantalones", "camisa", "chaqueta", "pelo", "mirada", "manos", "armas", "pierna", "manga", "ventana", "computadora", "pelear", "gafas", "ver", "llamar", "telefono", "espejo", "cordón", "hacer", "aprender", "escuchar", "escribir", "reloj", "tarea", "mochila", "divertido", "aburrido", "tener", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dicesies", "dicesiete", "diceocho", "dicenueve", "veinte"};
  private String[] englishWords = new String[]{"True", "She", "He", "I", "You", "We", "they", "students", "teacher", "test", "chair", "desk", "door", "kitchen", "living room", "bedroom", "bed", "videogames", "to play", "to run", "to fly", "to drive", "shoes", "pants", "shirt", "jacket", "hair", "eyes", "hands", "arms", "legs", "sleeve", "window", "computer", "to fight", "glasses", "to watch", "to call", "telephone", "mirror", "shoelace", "to do", "to learn", "to hear", "to write", "watch", "homework", "backpack", "fun", "boring", "to have", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
  private String[] frenchWords = new String[]{"vrai", "elle", "il", "je", "vous", "nous", "ils", "Étudiants", "enseignant", "test", "chaise", "bureau", "porte", "cuisine", "salon", "chambre", "lit", "jeux vidéo", "jouer", "courir", "voler", "conduire", "chaussures", "pantalon", "chemise", "veste", "cheveux", "yeux", "mains", "armes", "jambes", "manche", "fenêtre", "ordinateur", "se battre", "lunettes", "regarder", "appeler", "miroir", "lacet", "faire", "apprendre", "entendre", "écrire", "montre", "devoirs", "sac à dos", "amusant", "ennuyeux", "avoir", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf", "vingt"};
  private String[] italian = new String[]{"vero", "lei", "lui", "lo", "tu", "noi", "essi", "studenti", "insegante", "test", "sedia", "scrivania", "porta", "cucina", "soggiorno", "camera da letto", "letto", "videogiochi", "giocare", "correre", "volare", "guidare", "scarpe", "pantaloni", "camicia", "giacca", "capelli", "occhi", "mani", "braccia", "gambe", "manica", "finestra", "computer", "combattere", "occhiali", "guardare", "chiamre", "telefono", "specchio", "lacci delle scarpe", "fare", "imparare", "sentire", "scrivere", "guarda", "compiti a casa", "zaino", "diverimento", "noioso", "avere", "uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci", "undici", "dodici", "tredici", "quattordici", "quindici", "sedici", "diciassette anni", "diciotto", "diciannove", "venti"};
  public translator(String l, String a, int k){
    super(a, k);
    language=l;
  }

  public String translation(String word, String[] language){
    for(int i=0; i<englishWords.length-1; i++){
          if(word.toUpperCase().equals(englishWords[i].toUpperCase())){
            return word+" translates to "+language[i]+". Anything else you want me to do?";
          }
        }
    return "";
  }

  public boolean isSentence(String line){
    if(line.indexOf(" ")!=-1){
      return true;
    }
    return false;
  }

  public String translateSentence(String word, String[] language, String choice){
    String translatedSentence="";
      String temp="";
      ArrayList<String> sentence = new ArrayList<String>();
    if(choice.toUpperCase().equals("SENTENCE")){
        word+=" ";
        for(int i=0; i<word.length(); i++){
          if(word.substring(i, i+1).equals(" ")){
           sentence.add(temp);
            temp="";
          }
          else{
            temp+=word.substring(i, i+1);
          }
        }
        for(int i=0; i<sentence.size(); i++){
          for(int j=0; j<englishWords.length; j++){
        if(sentence.get(i).toUpperCase().equals(englishWords[j].toUpperCase())){
              translatedSentence+=language[j]+" ";
            }
          }
      }
     
        return translatedSentence+"\nAnything else you want me to do?";
    }
    return "";
  }
  public String translate(String language, String word, String choice){
    if(language.toUpperCase().equals("SPANISH")){
      if(choice.toUpperCase().equals("SENTENCE")){
        return translateSentence(word, spanish, choice);
      }
      else{
    return translation(word, spanish);
    }
  }
      else if(language.toUpperCase().equals("ITALIAN")){
        if(choice.toUpperCase().equals("SENTENCE")){
          return translateSentence(word, italian, choice);
        }
        return translation(word, italian);
      }
      else if(language.toUpperCase().equals("FRENCH")){
        if(choice.toUpperCase().equals("SENTENCE")){
          return translateSentence(word, frenchWords, choice);
        }
        return translation(word, frenchWords);
      }
    else{
      return "I cannot translate that word. Anything else you want me to do?";
    }
    
  }
}
