// Example of using Grapes for libraries
@Grapes(
  @Grab(group='org.apache.commons', module='commons-lang3', version='3.0')
  )

  import org.apache.commons.lang3.RandomStringUtils

  println RandomStringUtils.randomAlphanumeric(5)
