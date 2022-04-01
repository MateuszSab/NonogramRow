object NongramRow extends App {

  def pack(ns: List[Int]): List[List[Int]] = {
    ns.foldLeft(List.empty[List[Int]]) { (css, c) =>
      if (css.isEmpty) List(List(c))
      else if (c == css.last.head) css.init ++ List(css.last :+ c)
      else css :+ List(c)
    }
  }

  def countNongram(ln: List[Int]) = {
    (pack(ln)).filterNot(_.head == 0).foldLeft(List.empty[Int]) { (result, lst) =>
      result :+ lst.length
    }
  }


}
