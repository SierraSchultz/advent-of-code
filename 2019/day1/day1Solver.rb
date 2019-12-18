puzzleFile = File.open("./day1InputSierra.txt")

puzzleData = puzzleFile.readlines.map(&:chomp)

puzzleFile.close

fuelCount = 0

def fuelDividedBy3(spaceModule)
  (spaceModule.to_i / 3).floor
end

puzzleData.each do
  |spaceModule| fuelCount += fuelDividedBy3(spaceModule) - 2
end

puts fuelCount
