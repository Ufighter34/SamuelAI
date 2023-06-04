import java.util.ArrayList;
public class translator extends AIrecommend{
  private String language;
  private String[] spanish = new String[]{"cierto", "Ella", "el", "Yo", "Tu", "Nosotros/nosotras", "ellos/ellas", "estudiantes", "profesora/profesor", "examen", "silla", "escritorio", "puerta", "cocina", "sala de estar", "dormitorio", "cama", "videojuegos", "zapatos", "pantalones", "camisa", "chaqueta", "pelo", "mirada", "manos", "armas", "pierna", "manga", "ventana", "computadora", "gafas", "telefono", "espejo", "cordón", "reloj", "tarea", "mochila", "divertido", "aburrido", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dicesies", "dicesiete", "diceocho", "dicenueve", "veinte","padre", "madre", "hermano", "hermana", "tío", "tía", "abuelo", "abuela", "novio", "novia", "prometido", "esposo", "esposa", "hijo", "hijos", "hija", "hijas", "hermanos", "sofá", "estantería", "piso", "rojo", "azul", "verde", "púrpura", "naranja", "amarillo", "blanco", "negro", "rosa", "marrón", "perro", "gato", "ratón", "caballo", "serpiente", "tortuga", "conejo", "conejito", "ardilla", "águila", "pájaro", "pez", "tiburón", "medusa", "lagarto", "caimán", "cocodrilo", "pollo", "rana", "bicho", "gusano", "murciélago", "elefante", "león", "guepardo", "leopardo", "armadillo", "profesores", "pruebas", "sillas", "escritorios", "puertas", "cocinas", "salas de estar", "dormitorios", "camas", "videojuego", "zapato", "camisas", "ojo", "mano", "brazo", "pierna", "mangas", "ventanas", "computadoras", "teléfonos", "espejos", "cordones de zapatos", "relojes", "mochilas", "hermanos", "hermanas","tíos", "tías", "abuelos", "abuelas", "novios", "novias", "prometidos", "maridos", "esposas", "sofás", "estanterías", "pisos", "perros", "gatos", "ratones", "caballos", "serpientes", "tortugas", "conejos", "ardillas", "águilas", "pájaros", "peces", "tiburones", "medusas", "lagartos", "caimanes", "cocodrilos", "gallinas", "ranas", "insectos", "gusanos", "murciélagos", "elefantes", "leones", "guepardos", "leopardos", "armadillos"};
  private String[] spanish2 = new String[]{"arroz", "con", "regla", "notas", "clase de matematicas", "clase de ciencias sociales", " clase de historia", "historia", "gimnasio", "clase de idioma", "clase de español", "clase de francés", "clase de italian", "clase de inglés", "papel", "remoto", "pelota", "tarjeta", "audífono", "foto", "galleta", "pastel", "astilla", "astillas", "pizza", "queso", "ropa sucia", "sartén", "pan", "planta"};
  private String[][] spanishDict = new String[][]{spanish, spanish2};
  private String[] spanishVerbs = new String[]{"correr", "correr", "levantar", "levantar", "hablar", "hablar", "enseñar", "enseñar", "completar", "completar", "ver", "ver", "calcular", "calcular", "bailar", "bailar", "cantar", "cantar", "caminar", "caminar", "cortar", "cortar", "saltar", "saltar", "trabajar", "trabajar", "dibujar", "dibujar", "ordenar", "ordenar", "participar", "participar"};
  private String[] spanishSubjects = new String[]{"Yo", "Tú", "El","ella",  "Nosotros/nosotras", "Ellos/ellas" };
  private String[] englishVerbs = new String[]{"run", "runs", "lift", "lifts", "talk", "talks", "teach", "teaches", "commplete", "completes", "watch", "watches", "calculate", "calculates", "dance", "dances", "sing", "sings", "walk", "walks", "cut", "cuts", "jump", "jumps", "work", "works", "draw", "draws", "order", "orders", "participate", "participates"};
   private String[] englishWords = new String[]{"True", "She", "He", "I", "You", "We", "they", "students", "teacher", "test", "chair", "desk", "door", "kitchen", "living room", "bedroom", "bed", "videogames", "shoes", "pants", "shirt", "jacket", "hair", "eyes", "hands", "arms", "legs", "sleeve", "window", "computer", "glasses", "telephone", "mirror", "shoelace", "watch", "homework", "backpack", "fun", "boring", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "father", "mother", "brother", "sister", "uncle", "aunt", "grandfather", "grandmother", "boyfriend", "girlfriend", "fiance", "husband", "wife", "son", "sons", "daughter", "daughters","siblings", "couch", "bookcase", "floor", "red", "blue", "green", "purple", "orange", "yellow", "white", "black", "pink", "brown", "dog", "cat", "mouse", "horse", "snake", "turtle", "rabbit", "bunny", "squirrel", "eagle", "bird", "fish", "shark", "jellyfish", "lizard", "alligator", "crocodile", "chicken", "frog", "bug", "worm", "bat", "elephant", "lion", "cheetah", "leopard", "armadillo", "teachers", "tests", "chairs", "desks", "doors", "kitchens", "living rooms", "bedrooms", "beds", "videogame", "shoe", "shirts", "jackets", "eye", "hand", "arm", "leg", "sleeves", "windows", "computers", "telephones", "mirrors", "shoelaces", "watches", "backpacks", "brothers", "sisters", "uncles", "aunts", "grandfathers", "grandmothers", "boyfriends", "girlfriends", "fiances", "husbands", "wives", "couches", "bookcases", "floors", "dogs", "cats", "mouses", "horses", "snakes", "turtles", "rabbits", "bunnies", "squirrels", "eagles", "birds", "fishes", "sharks", "jellyfishes", "lizards", "alligators", "crocodiles", "chickens", "frogs", "bugs", "worms", "bats", "elephants", "lions", "cheetahs", "leopards", "armadillos"};
  private String[] englishWords2 = new String[]{"rice", "with", "ruler", "notes", "math class", "science class", "history class", "history", "gym", "language class", "spanish class", "french class", "italian  class", "english class", "paper", "remote", "ball", "card", "headphones", "picture", "cookie", "cake", "chip", "chips", "pizza", "cheese", "laundry", "pan", "bread", "plant"};
  private String[][] englishDict = new String[][]{englishWords, englishWords2};
  private String[] frenchWords = new String[]{"vrai", "elle", "il", "je", "toi", "nous", "ils", "étudiants", "professeur", "test", "chaise", "bureau", "porte", "cuisine", "salon", "chambre", "lit", "jeux vidéo", "chaussures", "pantalon", "chemise", "veste", "cheveux", "yeux", "mains", "bras", "jambes", "manche", "fenêtre", "ordinateur", "lunettes", "téléphone", "miroir", "lacet", "devoirs", "sac à dos", "amusant", "ennuyeux", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf", "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize", "dix-sept", "dix-huit", "dix-neuf", "vingt", "mère", "père", "frère", "soeur", "oncle", "tante", "grand-père", "grand-mère", "petit ami", "petite amie", "fiancé", "mari", "femme", "fils", "fils", "fille", "filles", "frères et sœurs", "future", "canapé", "bibliothèque", "sol", "rouge", "bleu", "vert", "violet", "orange", "jaune", "blanc", "noir", "rose", "marron", "chien", "chat", "souris", "cheval", "serpent", "tortue", "lapin", "lapin", "écureuil", "aigle", "oiseau", "poisson", "requin", "méduse", "lézard", "alligator", "crocodile", "poulet", "grenouille", "insecte", "ver", "chauve-souris", "éléphant", "lion", "guépard", "léopard", "tatou", "professeurs", "tests", "chaises", "bureaux", "portes", "cuisines", "salons", "chambres", "lits", "jeu vidéo", "chaussure", "chemises", "vestes", "oeil", "main", "bras", "jambe", "manches", "fenêtres", "ordinateurs", "téléphones", "miroirs", "les lacets", "montres", "sacs à dos", "frères", "sœurs", "oncles", "tantes", "grands-pères", "grands-mères", "petits amis", "petites amies", "fiancés", "maris", "femmes", "canapés", "bibliothèques", "sols", "chiens", "chats", "souris", "chevaux", "serpents", "tortues", "lapins", "lapins", "écureuils", "aigles", "oiseaux", "poissons", "requins", "méduses", "lézards", "alligators", "crocodiles", "poulets", "grenouilles", "insectes", "vers ", "chauves-souris", "éléphants", "lions", "guépards", "léopards", "tatous"};
  private String[] french2 = new String[]{"riz", "avec", "règle", "remarques", "cours de maths", "classe de sciences", "cours d'histoire", "histoire", "salle de sport", "cours de langue", "classe d'espagnol", "cours de français", "cours d'italien", "cours d'anglais", "papier", "télécommande", "balle", "carte", "écouteurs", "image", "biscuit", "gâteau", "ébrécher", "puces", "fromage", "blanchisserie", "poêle", "pain", "usine"};
  private String[][]frenchDict = new String[][]{frenchWords, french2};
  private String[] frenchSubjects = new String[]{"elle", "il", "je", "toi", "nous", "ils"};
  private String[] frenchVerbs = new String[]{"courir", "courir", "soulever", "soulever", "parler", "parler", "enseigner", "enseigner", "compléter", "compléter", "regarder", "regarder", "calculer", "calculer", "danser", "danser", "chanter", "chanter", "marcher", "marcher", "couper", "couper", "sauter", "sauter", "travailler", "travailler", "dessiner", "dessiner", "commander", "commander", "participer", "participer"};
  private String[] italian = new String[]{"vero", "lei", "lui", "io", "tu", "noi", "loro", "studenti", "insegante", "test", "sedia", "scrivania", "porta", "cucina", "soggiorno", "camera da letto", "letto", "videogiochi", "scarpe", "pantaloni", "camicia", "giacca", "capelli", "occhi", "mani", "braccia", "gambe", "manica", "finestra", "computer", "occhiali", "chiamre", "telefono", "specchio", "lacci delle scarpe", "guarda", "compiti a casa", "zaino", "diverimento", "noioso", "uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci", "undici", "dodici", "tredici", "quattordici", "quindici", "sedici", "diciassette anni", "diciotto", "diciannove", "venti", "madre", "padre", "fratello", "sorella", "zio", "zia", "nonno", "nonna", "fidanzato", "fidanzata", "fidanzato", "marito", "moglie", "figlio", "figli", "figlia", "figlie", "fratelli", "divano", "libreria", "pavimento", "rosso", "blu", "verde", "viola", "arancione", "giallo", "bianco", "nero", "rosa", "marrone", "cane", "gatto", "topo", "cavallo", "serpente", "tartaruga", "coniglio", "coniglio", "scoiattolo", "aquila", "uccello", "pesce", "squalo", "medusa", "lucertola", "alligatore", "coccodrillo", "pollo", "rana", "insetto", "verme", "pipistrello", "elefante", "leone", "ghepardo", "leopardo", "armadillo", "insegnanti", "test", "sedie", "banchi", "porte", "cucine", "salotti", "camere da letto", "letti", "videogioco", "scarpa", "camicie", "giacche", "occhio", "mano", "braccio", "gamba", "maniche", "finestre", "computer", "telefoni", "specchi", "lacci delle scarpe", "orologi", "zaini", "fratelli", "sorelle", "zii", "zie", "nonni", "nonne", "fidanzati", "fidanzate", "fidanzati", "mariti", "mogli", "divani", "librerie", "pavimenti", "cani", "gatti", "topi", "cavalli", "serpenti", "tartarughe", "conigli", "coniglietti", "scoiattoli", "aquile", "uccelli", "pesci", "squali", "meduse", "lucertole", "alligatori", "coccodrilli", "polli", "rane", "insetti", "vermi", "pipistrelli", "elefanti", "leoni", "ghepardi", "leopardi", "armadilli"};
  private String[] italian2 = new String[]{"riso", "con", "governate", "appunti", "classe di matematica", "classe di scienze", "lezione di storia", "storia", "palestra", "classe di lingua", "lezione di spagnolo", "classe francese", "classe italiana", "classe di inglese", "carta", "a distanza", "palla", "carta", "cuffie", "immagine", "biscotto", "torta", "patata fritta", "patatine fritte", "pizza", "formaggio", "lavanderia", "padella", "pane", "pianta"};
  private String[][]italianDict = new String[][]{italian, italian2};
  private String[] italianVerbs = new String[]{"correre", "correre", "sollevare", "sollevare", "parlare", "parlare", "insegnare", "insegnare", "completare", "completare", "guardare", "guardare", "calcolare", "calcolare", "ballare", "ballare", "cantare", "cantare", "camminare", "camminare", "tagliare", "tagliare", "saltare", "saltare", "lavorare", "lavoare", "disegnare", "disegnare", "ordinare", "ordinare", "partecipare", "partecipare"};
  private String[] italianSubjects = new String[]{"lei", "lui", "io", "tu", "noi", "loro"};
  public translator(String l, String a){
    super(a);
    language=l;
  }

  public String translation(String word, String[][] language){
    for(int i=0; i<englishDict.length; i++){
    for(int j=0; j<englishDict[i].length-1; j++){
          if(word.toUpperCase().equals(englishDict[i][j].toUpperCase())){
            return word+" translates to "+language[i][j]+". Anything else you want me to do?";
          }
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

  public String translateSentence(String word, String[][] language, String choice, String[] verbs, String[] subjects){
    String translatedSentence="";
      String temp="";
      ArrayList<String> sentence = new ArrayList<String>();
    if(choice.toUpperCase().equals("SENTENCE")){
        word+=" ";
        for(int i=0; i<word.length(); i++){
          if(word.substring(i, i+1).equals(" ")){
           sentence.add(temp);
            //System.out.println(temp);
            temp="";
          }
          else{
            temp+=word.substring(i, i+1);
          }
        }
      //ArrayList <Boolean> translated = new ArrayList<Boolean>();
      
      //conjugating spanish verbs
      boolean hasTranslated = true;
        for(int i=0; i<sentence.size(); i++){
          for(int j=0; j<englishDict.length; j++){
        for(int k=0; k<englishDict[j].length; k++){
          if(sentence.get(i).toUpperCase().equals(englishDict[j][k].toUpperCase())){
              translatedSentence+=language[j][k]+" ";
            //System.out.println(language[j][k]);
          hasTranslated=true;
          j=englishDict.length-1;
            k=englishDict[j].length-1;
            }
            else{
              hasTranslated=false;
            }
            //translated.add(hasTranslated);
          }
          
      }
          if(hasTranslated==false){
            translatedSentence+=sentence.get(i)+" ";
          }
        }
//System.out.println(translatedSentence);
      while(sentence.size()!=0){
        sentence.remove(0);
      }
      String subject = "";
      String verb = "";
      int verbPosition=0;
      String ending = "";
 translatedSentence+=" ";
        for(int i=0; i<translatedSentence.length(); i++){
          if(translatedSentence.substring(i, i+1).equals(" ")){
           sentence.add(temp);
            temp="";
          }
          else{
            temp+=translatedSentence.substring(i, i+1);
            //System.out.println(temp);
          }
        }
      translatedSentence="";
      for(int i=0; i<sentence.size(); i++){
        for(int j=0; j<englishVerbs.length; j++){
        if(sentence.get(i).toUpperCase().equals(englishVerbs[j].toUpperCase())){
          verbPosition=i;
          sentence.set(i, verbs[j]);
          j=englishVerbs.length-1;
          i=sentence.size()-1;
        }
        }
      }
      for(int i=0; i<verbPosition; i++){
        for(int j=0; j<subjects.length; j++){
      if(sentence.get(i).toUpperCase().equals(subjects[j].toUpperCase())){
        subject+=subjects[j];
      }
      }
      }
      //System.out.println(subject);
      int stemEnding=0;
      for(int i=0; i<sentence.size(); i++){
        for(int j=0; j<italian.length; j++){
          if(sentence.get(i).toUpperCase().equals(italian[j].toUpperCase())){
            stemEnding=3;
            j=italian.length-1;
            i=sentence.size()-1;
          }
          else{
            stemEnding=2;
          }
        }
      }
      //System.out.println(stemEnding);
      for(int i=0; i<sentence.size(); i++){
        if(sentence.get(i).toUpperCase().equals(englishVerbs[i])){
      sentence.set(verbPosition, sentence.get(verbPosition).substring(0, sentence.get(verbPosition).length()-stemEnding));
      }
    }
if(subject.toUpperCase().equals("YO")){
  sentence.set(verbPosition, sentence.get(verbPosition)+"o");
}
      else if(subject.toUpperCase().equals("TÚ")){
        if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("ar")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"as");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"es");
        }
      }

      else if(subject.toUpperCase().equals("EL")||subject.toUpperCase().equals("ELLA")){    if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("ar")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"a");
        }                                                                            else{
        sentence.set(verbPosition, sentence.get(verbPosition)+"e"); 
      }
      }
      else if(subject.toUpperCase().equals("NOSOTROS/NOSOTRAS")){
        if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("ar")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"amos");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"emos");
        }
      }
      else if(subject.toUpperCase().equals("ELLOS/ELLAS")){
        if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("ar")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"an");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"en");
        }
      }
      else if(subject.toUpperCase().equals("JE")){
        if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("er")){
       sentence.set(verbPosition, sentence.get(verbPosition)+"e");   
      }
        else if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("er")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"is");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"s");
        }
      }
      else if(subject.toUpperCase().equals("TOI")){
        if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("er")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"es");
        }
        else if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("er")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"is");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"s");
        }
      }
      else if(subject.toUpperCase().equals("IL")||subject.toUpperCase().equals("ELLE")){
        if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("er")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"e");
        }
        else if((sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("ir"))){
          sentence.set(verbPosition, sentence.get(verbPosition)+"it");
        }
        }

      else if(subject.toUpperCase().equals("NOUS")){
        if((sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("er"))){
          sentence.set(verbPosition, sentence.get(verbPosition)+"ons");
        }
        else if((sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("ir"))){
          sentence.set(verbPosition, sentence.get(verbPosition)+"issons");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"ons");
        }
      }

      else if(subject.toUpperCase().equals("ILS")){
        if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("er")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"ent");
        }
        else if(sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("ir")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"issent");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"ent");
        }
      }

      else if(subject.toUpperCase().equals("IO")){
        sentence.set(verbPosition, sentence.get(verbPosition)+"o");
      }

      else if(subject.toUpperCase().equals("TU")){
sentence.set(verbPosition, sentence.get(verbPosition)+"i");
      }
      else if(subject.toUpperCase().equals("LUI")||subject.toUpperCase().equals("LEI")){
        if((sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("are"))){
          sentence.set(verbPosition, sentence.get(verbPosition)+"a");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"e");
        }
      }
      else if(subject.toUpperCase().equals("NOI")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"iamo");
      }

      else if(subject.toUpperCase().equals("LORO")){
    if  (sentence.get(verbPosition).substring(sentence.get(verbPosition).length()-stemEnding, sentence.get(verbPosition).length()).equals("are")){
          sentence.set(verbPosition, sentence.get(verbPosition)+"ano");
        }
        else{
          sentence.set(verbPosition, sentence.get(verbPosition)+"ono");
        }
      }
      for(int i=0; i<sentence.size(); i++){
        translatedSentence+=sentence.get(i)+" ";
      }
        return translatedSentence+"\nAnything else you want me to do?";
    }
    return "";
  }
  public String translate(String language, String word, String choice){
    if(language.toUpperCase().equals("SPANISH")){
      if(choice.toUpperCase().equals("SENTENCE")){
        return translateSentence(word, spanishDict, choice, spanishVerbs, spanishSubjects);
      }
      else{
    return translation(word, spanishDict);
    }
  }
      else if(language.toUpperCase().equals("ITALIAN")){
        if(choice.toUpperCase().equals("SENTENCE")){
          return translateSentence(word, italianDict, choice, italianVerbs, italianSubjects);
        }
        return translation(word, italianDict);
      }
      else if(language.toUpperCase().equals("FRENCH")){
        if(choice.toUpperCase().equals("SENTENCE")){
          return translateSentence(word, frenchDict, choice, frenchVerbs, frenchSubjects);
        }
        return translation(word, frenchDict);
      }
    else{
      return "I cannot translate that word. Anything else you want me to do?";
    }
  }
}