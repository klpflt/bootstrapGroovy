def myBand = "Volbeat"
def goodBands = [ "Die Aerzte", "Modest Mouse", "Oceansize", myBand ]

println goodBands[3]

goodBands.remove("Volbeat")
goodBands.add("Wilco")

println goodBands[3]

println myBand
