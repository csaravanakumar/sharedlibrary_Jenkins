import org.saro.*
node {
  def utils = new Utilities(env, steps)
  mvn this, 'clean package'
}
