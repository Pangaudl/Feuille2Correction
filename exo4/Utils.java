class Utils{
  public static int ackermann(int m, int n){
    int ret;
    //𝐴(0, 𝑛) = 𝑛 + 1 pour 𝑛 > 0

    if(m == 0){
      ret = n + 1;
    }
    // 𝐴(𝑚, 0) = 𝐴(𝑚 − 1, 1) pour 𝑚 > 0
    else if(n == 0)
    {
      ret = ackermann(m-1, 1);
    }
    else
    //𝐴(𝑚, 𝑛) = 𝐴(𝑚 − 1, 𝐴(𝑚, 𝑛 − 1)) pour 𝑚 > 0 et 𝑛 > 0
    {
      ret = ackermann(m - 1, ackermann(m, n- 1));
    }
    return ret;
  }
}