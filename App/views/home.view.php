<?= loadPartial('head')?>
<?= loadPartial('navbar')?>
<?= loadPartial('showcase-search')?>
<?= loadPartial('top-banner')?>

<?php foreach($listings as $listing): ?>
  

          <!-- Job Listing 5: Graphic Designer -->
          <div class="rounded-lg shadow-md bg-white">
            <div class="p-4">
              <h2 class="text-xl font-semibold"><?= $listing->title ?></h2>
              <p class="text-gray-700 text-lg mt-2">
              <?= $listing->description?>
              </p>
              <ul class="my-4 bg-gray-100 p-4 rounded">
                <li class="mb-2"><strong>Salary:</strong> Rs. <?= $listing->salary?></li>
                <li class="mb-2">
                  <strong>Location:</strong> <?= $listing->city?>,<?= $listing->state?>
                  <!--<span
                    class="text-xs bg-blue-500 text-white rounded-full px-2 py-1 ml-2"
                    >Local</span
                  >-->
                  <?php if(!empty($listings->tags)) : ?>
        <li class="mb-2">
          <strong>Tags: </strong><?= $listing->tags?>
        </li>
        <?php endif; ?>
      </ul>

              <a href="/listings/<?=$listing->id?>"
                class="block w-full text-center px-5 py-2.5 shadow-sm rounded border text-base font-medium text-indigo-700 bg-indigo-100 hover:bg-indigo-200"
              >
                Details
              </a>
            </div>
          </div>

        <?php endforeach; ?>
          </div>
        </div>
        <a href="/listings" class="block text-xl text-center">
          <i class="fa fa-arrow-alt-circle-right"></i>
          Show All Jobs
        </a>
      </section>


     
    <?= loadPartial('bottom-banner')?>


    <?= loadPartial('footer')?>
