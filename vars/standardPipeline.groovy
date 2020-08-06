import org.saro.*

  def s1 = new sample (env, steps)
  node {
  s1.mvn this, 'clean package'
}
