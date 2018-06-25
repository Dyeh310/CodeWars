    public static int TripleDouble (long num1, long num2)
    {
      String n1 = String.valueOf(num1);
      String n2 = String.valueOf(num2);
      
      for (int i = 0; i < n1.length(); i++)
      {
          char c = n1.charAt(i);
          if (n1.contains(new String(new char[]{c, c, c})) && n2.contains(
          new String(new char[]{c, c,})))
          {
              return 1;
          }
      }
      
      return 0;
    }
