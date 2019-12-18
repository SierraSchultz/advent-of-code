puzzleFile = File.open("./day1InputBrittany.txt")
puzzleData = puzzleFile.readlines.map(&:chomp)
puzzleFile.close

class CalculateSpaceModuleFuel
  @@fuelCount = 0

  def fuelDividedBy3(spaceModule)
    (spaceModule / 3).floor
  end

  def calculateFuel(puzzleData)
    puzzleData.each do |spaceModule|
      @@fuelCount += totalFuelOfModule(spaceModule.to_i)
    end
    puts @@fuelCount
  end

  def calculateModuleFuel(spaceModule)
    spaceModule = fuelDividedBy3(spaceModule) - 2
  end

  def totalFuelOfModule(spaceModule)
    moduleFuel = 0
    while spaceModule >= 0
      spaceModule = calculateModuleFuel(spaceModule)
      if spaceModule > 0
        moduleFuel += spaceModule
      end
    end
    moduleFuel
  end
end

CalculateSpaceModuleFuel.new.calculateFuel(puzzleData)
