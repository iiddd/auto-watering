export type TypeHistory = {
  date: string,
  status: string
};

export type TypeCard = {
  title: string,
  moisture: number,
  history: TypeHistory[]
};

export type TypeCards = {
  bigPlants: TypeCard,
  mediumPlants: TypeCard,
  smallPlants: TypeCard
};
